async function addToCart(item) {
    try {
        const response = await fetch('/api/cart/add',{
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ itemName: item }),
        });

        if (response.ok) {
            const savedItem = await response.json();
            cartItems.push(savedItem.itemName);
            renderCart();
        } else {
            alert('Failed to add item to cart');
        }
    } catch (error) {
        console.error('Error adding item to cart:', error);
        alert('An error occurred while adding item to cart');
    }
}

async function renderCart() {
    try {
        const response = await fetch('/api/cart/items');
        if (response.ok) {
            const items = await response.json();
            var cartList = document.getElementById("cart-items");
            cartList.innerHTML = "";
            items.forEach(function(item) {
                var listItem = document.createElement("li");
                listItem.textContent = item.itemName;
                cartList.appendChild(listItem);
            });
        } else {
            alert('Failed to load cart items');
        }
    } catch (error) {
        console.error('Error loading cart items:', error);
        alert('An error occurred while loading cart items');
    }
}

async function checkout() {
    try {
        const response = await fetch('/api/cart/clear', {
            method: 'DELETE',
        });

        if (response.ok) {
            alert("Thank you for your order!");
            cartItems = [];
            renderCart();
        } else {
            alert('Failed to checkout');
        }
    } catch (error) {
        console.error('Error checking out:', error);
        alert('An error occurred while checking out');
    }
}
