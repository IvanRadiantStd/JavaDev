package radiant.webapp.model;


import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;
import java.util.List;

public class Organization {

    public class Period {
        private Date strtDate;
        private Date endDate;
        private String position;
        private String content;

        public Period(Date strtDate, Date endDate, String position, String content) {
            this.strtDate = strtDate;
            this.endDate = endDate;
            this.position = position;
            this.content = content;
        }
    }

    private Link link;
    private List<Period> periods;


    public Organization(Link link, List<Period> periods){
        this.link = link;
        this.periods = periods;
    }

}
