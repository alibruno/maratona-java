package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.Objects;

public record ReportDto(String aircraftName, Country country, Currency currency, String personName) {
    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            return new ReportDto(
                    Objects.requireNonNull(aircraftName),
                    Objects.requireNonNull(country),
                    Objects.requireNonNull(currency),
                    Objects.requireNonNull(personName)
            );
        }
    }
}
