package br.com.fiap.checkpoint1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Nome do cliente é obrigatório")
    private String clienteNome;
    
    private LocalDate dataPedido = LocalDate.now();
    
    @PositiveOrZero(message = "Valor total não pode ser negativo")
    private Double valorTotal;

    // Construtor padrão necessário para o JPA
    public Pedido() {
    }

    // Construtor com argumentos
    public Pedido(String clienteNome, Double valorTotal) {
        this.clienteNome = clienteNome;
        this.valorTotal = valorTotal;
        this.dataPedido = LocalDate.now();
    }
}