package practice.documents.factory;

import practice.documents.document.IDocument;
import practice.documents.document.TextDocument;

public class TextDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument openDocument() {
        return new TextDocument();
    }
}
