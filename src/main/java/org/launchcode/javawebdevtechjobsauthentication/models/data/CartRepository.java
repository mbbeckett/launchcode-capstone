package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.launchcode.javawebdevtechjobsauthentication.models.Cart;
import org.launchcode.javawebdevtechjobsauthentication.models.Product;
import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
//
//    List<Cart> deleteByUser(User user);
//
//    List<Cart> findAllByUserOrder(User user);

//    Cart findByCartId(int id);

//    public Cart findByCustomer(Customer customer);

//    public Cart findByUserAndProduct(Customer customer, Product product);

//    public void deleteByUserAndProduct(int productId, int userId);

//    public Cart updateQuantity(int quantity, int productId, int userId);

//    public List<Cart> listCartItems(Cart cart);
//
//    public List<Cart> listCartItems(Cart cart);


}