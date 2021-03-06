package tudelft.invoicemocked;

import java.util.ArrayList;
import java.util.List;

class InvoiceFilter {

    private final InvoiceDao dao;

    public InvoiceFilter (InvoiceDao dao) {
        this.dao = dao;
    }

    public List<Invoice> filter() {

        List<Invoice> allInvoices = dao.all();

        List<Invoice> filtered = new ArrayList<>();

        for(Invoice inv : allInvoices) {
            if(inv.getValue() < 100.0)
                filtered.add(inv);
        }

        return filtered;

    }
}