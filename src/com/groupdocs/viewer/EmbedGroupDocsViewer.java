package com.groupdocs.viewer;

import org.apache.velocity.tools.view.tools.ViewTool;

public class EmbedGroupDocsViewer implements ViewTool {
    @Override
    public void init(Object o) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String RenderIframe(String fileGuid, String quality, String usePdf, String download, String frameborder, int width, int height) {
        return "<iframe src=\"https://apps.groupdocs.com/document-viewer/Embed/" + fileGuid + "?quality=" + quality + "&use_pdf=" + usePdf + "&download=" + download + "&referer=DotCms-Viewer/1.0.0\" frameborder=\"" + frameborder + "\" width=\"" + Integer.toString(width) + "\" height=\"" + Integer.toString(height) +  "\">If you can see this text, your browser does not support iframes. Please enable iframe support in your browser or use the latest version of any popular web browser such as Mozilla Firefox or Google Chrome. For more help, please check our documentation Wiki: <a href=\"http://groupdocs.com/docs/display/Viewer/GroupDocs+Viewer+Integration+with+3rd+Party+Platforms\">http://groupdocs.com/docs/display/Viewer/GroupDocs+Viewer+Integration+with+3rd+Party+Platforms</a></iframe>";
    }

    public String RenderIframe(String fileGuid, int width, int height) {
        return RenderIframe(fileGuid, "50", "False", "False", "0", width, height);
    }
}