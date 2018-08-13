package com.example.demo.domain;

import lombok.Data;

import java.util.List;

/**
 * @author sunlei19
 * @create 2018/8/13
 */
@Data
public class OneLayer {

    private int oneId;

    private List<TwoLayer> twoLayer;
}
