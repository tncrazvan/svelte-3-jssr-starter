package net.razshare.svelte3jssr.core.models;

import lombok.Getter;

public class SvelteComponentResult {
    
    @Getter private final String jsCode;
    @Getter private final String cssCode;
    @Getter private final String head;
    @Getter private final String html;

    /**
     * Represents a Svelte object in its html, js and css forms.
     * @param jsCode raw javascript code.
     * @param cssCode raw css code.
     * @param head head html.
     * @param html component html.
     */
    public SvelteComponentResult(
        String jsCode,
        String cssCode,
        String head,
        String html
    ){
        this.jsCode = jsCode;
        this.cssCode = cssCode;
        this.head = head;
        this.html = html;
    }
}
