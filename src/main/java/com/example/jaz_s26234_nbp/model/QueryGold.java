package com.example.jaz_s26234_nbp.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class QueryGold {

    @Entity
    @Table(name = "query_gold")
    public class QueryGold {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "gold")
        private String currency;

        @Column(name = "start_date")
        private String startDate;

        @Column(name = "end_date")
        private String endDate;

        @Column(name = "calculated_rate")
        private double calculatedRate;

        @Column(name = "query_date_time")
        private LocalDateTime queryDateTime;


}
