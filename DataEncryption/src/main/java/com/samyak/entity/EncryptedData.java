package com.samyak.entity;

import com.samyak.convertor.AesEncryptor;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EncryptedData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable=false)
    private String firstName;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable = false)
    private String lastName;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable = false)
    private String userName;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable = false)
    private String password;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable = true)
    private Integer quantity;

    @Convert(converter = AesEncryptor.class)
    @Column(nullable = true)
    private double price;
}
