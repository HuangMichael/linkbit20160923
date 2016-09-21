package com.linkbit.domain.user;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Entity
@Table(name = "T_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "userName", length = 20, unique = true)
    private String userName;
    @Column(name = "password", length = 100)
    private String password;
    @Column(name = "status", length = 1)
    private String status;

}
