const API_URL = "http://localhost:8080/products";

const form = document.getElementById("productForm");
const table = document.getElementById("productTable");
const notification = document.getElementById("notification");

// 🔔 Notificación
function showNotification(msg) {
    notification.textContent = msg;
    notification.style.display = "block";
    setTimeout(() => notification.style.display = "none", 2000);
}

// 🔹 GET ALL (cargar productos)
async function loadProducts() {
    const res = await fetch(API_URL);
    const products = await res.json();

    renderProducts(products);
}

// 🧠 Render tabla
function renderProducts(products) {
    table.innerHTML = "";

    products.forEach(product => {
        table.innerHTML += `
            <tr>
                <td>${product.name}</td>
                <td>${product.category}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>
                    <button class="delete-btn" onclick="deleteProduct(${product.id})">
                        Eliminar
                    </button>
                </td>
            </tr>
        `;
    });
}

// ➕ CREATE o UPDATE (lógica inteligente)
form.addEventListener("submit", async (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value.trim();
    const category = document.getElementById("category").value;
    const price = parseFloat(document.getElementById("price").value);
    const stock = parseInt(document.getElementById("stock").value);

    // 🔍 Verificar si ya existe
    const res = await fetch(API_URL);
    const products = await res.json();

    const existing = products.find(p => p.name.toLowerCase() === name.toLowerCase());

    if (existing) {
        // 🔄 UPDATE (sumar stock)
        const updatedProduct = {
            ...existing,
            stock: existing.stock + stock
        };

        await fetch(`${API_URL}/${existing.id}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(updatedProduct)
        });

        showNotification("Stock actualizado");
    } else {
        // ➕ CREATE
        const newProduct = { name, category, price, stock };

        await fetch(API_URL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newProduct)
        });

        showNotification("Producto agregado");
    }

    form.reset();
    loadProducts();
});

// ❌ DELETE
async function deleteProduct(id) {
    await fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    });

    showNotification("Producto eliminado");
    loadProducts();
}

// 📁 EXPORT CSV (desde backend cargado)
async function exportCSV() {
    const res = await fetch(API_URL);
    const products = await res.json();

    let csv = "\uFEFFName;Category;Price;Stock\n";

    products.forEach(p => {
        csv += `${p.name};${p.category};${p.price};${p.stock}\n`;
    });

    const blob = new Blob([csv], { type: "text/csv" });
    const url = URL.createObjectURL(blob);

    const a = document.createElement("a");
    a.href = url;
    a.download = "products.csv";
    a.click();
}

document.getElementById("exportBtn").addEventListener("click", exportCSV);

// 🚀 INIT
loadProducts();