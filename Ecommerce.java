<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ShopEase - E-Commerce</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; font-family: Arial, sans-serif; }
        body { background: #f5f5f5; color: #333; }
        header { background: #1e90ff; color: white; padding: 20px; text-align: center; }
        header h1 { margin-bottom: 5px; }
        nav { margin-top: 10px; }
        nav a { color: white; text-decoration: none; margin: 0 15px; font-weight: bold; }
        nav a:hover { text-decoration: underline; }
        .container { max-width: 1200px; margin: 30px auto; padding: 0 20px; display: flex; flex-wrap: wrap; gap: 20px; justify-content: center; }
        .product-card { background: white; padding: 15px; border-radius: 12px; width: 250px; box-shadow: 0 4px 10px rgba(0,0,0,0.1); transition: transform 0.3s; }
        .product-card:hover { transform: translateY(-5px); }
        .product-card img { width: 100%; border-radius: 12px; margin-bottom: 10px; }
        .product-card h3 { color: #1e90ff; margin-bottom: 5px; }
        .product-card p { margin-bottom: 10px; font-size: 14px; }
        .product-card button { background: #1e90ff; color: white; padding: 10px 15px; border: none; border-radius: 8px; cursor: pointer; transition: background 0.3s; }
        .product-card button:hover { background: #0d6efd; }
        footer { text-align: center; padding: 20px; background: #1e90ff; color: white; margin-top: 40px; border-radius: 12px 12px 0 0; }
    </style>
</head>
<body>

<header>
    <h1>ShopEase</h1>
    <nav>
        <a href="#products">Products</a>
        <a href="#cart">Cart</a>
        <a href="#contact">Contact</a>
    </nav>
</header>

<div class="container" id="products">
    <!-- Product cards will be inserted here by JS -->
</div>

<footer>
    &copy; 2026 Poovitha Raja | ShopEase E-Commerce Project
</footer>

<script>
    const products = [
        { id: 1, name: "Wireless Headphones", price: 49.99, img: "https://via.placeholder.com/250x150?text=Headphones" },
        { id: 2, name: "Smartwatch", price: 99.99, img: "https://via.placeholder.com/250x150?text=Smartwatch" },
        { id: 3, name: "Gaming Mouse", price: 29.99, img: "https://via.placeholder.com/250x150?text=Gaming+Mouse" },
        { id: 4, name: "Laptop Stand", price: 39.99, img: "https://via.placeholder.com/250x150?text=Laptop+Stand" },
        { id: 5, name: "Bluetooth Speaker", price: 59.99, img: "https://via.placeholder.com/250x150?text=Speaker" }
    ];

    const container = document.getElementById('products');

    function addToCart(product) {
        alert(`${product.name} added to cart!`);
    }

    function displayProducts() {
        products.forEach(product => {
            const card = document.createElement('div');
            card.className = 'product-card';
            card.innerHTML = `
                <img src="${product.img}" alt="${product.name}">
                <h3>${product.name}</h3>
                <p>Price: $${product.price}</p>
                <button onclick="addToCart({id:${product.id}, name:'${product.name}'})">Add to Cart</button>
            `;
            container.appendChild(card);
        });
    }

    displayProducts();
</script>

</body>
</html>
