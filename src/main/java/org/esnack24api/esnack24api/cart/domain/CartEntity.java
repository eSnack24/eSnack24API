package org.esnack24api.esnack24api.cart.domain;

import jakarta.persistence.*;
import lombok.*;
import org.esnack24api.esnack24api.product.domain.ProductEntity;
import org.esnack24api.esnack24api.user.domain.UserEntity;

@Setter
@Entity
@Table(name = "tbl_cart")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"product", "user"})
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement로 자동 생성되는 pk
    private Long cno;

    private int cqty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="pno")
    private ProductEntity product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="uno")
    private UserEntity user;


}
