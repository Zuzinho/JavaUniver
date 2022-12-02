package practice.documents.factory;

import practice.documents.document.IDocument;
import practice.documents.document.ImageDocument;

import java.awt.*;

public class ImageDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument openDocument() {
        return new ImageDocument();
    }
}
