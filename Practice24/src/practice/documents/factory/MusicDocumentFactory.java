package practice.documents.factory;

import practice.documents.document.IDocument;
import practice.documents.document.MusicDocument;

public class MusicDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new MusicDocument();
    }

    @Override
    public IDocument openDocument() {
        return new MusicDocument();
    }
}
