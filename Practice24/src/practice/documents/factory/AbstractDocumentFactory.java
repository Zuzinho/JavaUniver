package practice.documents.factory;

import practice.documents.document.IDocument;

public interface AbstractDocumentFactory {
    public IDocument createDocument();
    public IDocument openDocument();
}
