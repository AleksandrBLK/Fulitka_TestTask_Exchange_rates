package exchange_rates.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class currencylayerResponseDto {
    private boolean success;
    private Map<String, String> quotes;


    public boolean isSuccess() {
        return success;
    }

    public Map<String, String> getQuotes() {
        return quotes;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setQuotes(Map<String, String> quotes) {
        this.quotes = quotes;
    }
}
