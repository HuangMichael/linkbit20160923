package com.linkbit.domain.user;

import lombok.*;

import javax.persistence.*;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Entity
@Table(name="T_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private String status;

}
