package practice.documents.factory;

import practice.documents.document.IDocument;

public class DocumentFactory {
    public IDocument createDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("creating document");
        return abstractDocumentFactory.createDocument();
    }
    public IDocument openDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("opening document");
        return abstractDocumentFactory.openDocument();
    }
}
