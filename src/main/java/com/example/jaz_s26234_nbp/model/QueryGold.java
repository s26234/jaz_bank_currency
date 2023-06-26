package com.example.jaz_s26234_nbp.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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

        public QueryGold() {
        }


        public QueryGold(String currency, String startDate, String endDate, double calculatedRate, LocalDateTime queryDateTime) {
            this.currency = currency;
            this.startDate = startDate;
            this.endDate = endDate;
            this.calculatedRate = calculatedRate;
            this.queryDateTime = queryDateTime;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public double getCalculatedRate() {
            return calculatedRate;
        }

        public void setCalculatedRate(double calculatedRate) {
            this.calculatedRate = calculatedRate;
        }

        public LocalDateTime getQueryDateTime() {
            return queryDateTime;
        }

        public void setQueryDateTime(LocalDateTime queryDateTime) {
            this.queryDateTime = queryDateTime;
        }

    }
