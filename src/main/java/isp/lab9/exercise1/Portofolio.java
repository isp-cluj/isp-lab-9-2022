/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mihai.hulea
 */
public class Portofolio {
    
    @Getter @Setter
    private BigDecimal funds;

    public Portofolio(BigDecimal funds) {
        this.funds = funds;
    }
    
    
}
