package com.redhat.samples.web.tld;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SampleTag extends TagSupport {

	private static final long serialVersionUID = 8384968788954608561L;

	@Override
    public int doStartTag() throws JspException {

        try {
            // Get the writer object for output.
            JspWriter out = this.pageContext.getOut();

            out.println("Sample Tag is it working");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
