package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class X1PDeclaration extends XPDeclaration
{
    private XPDeclaration _xPDeclaration_;
    private PDeclaration _pDeclaration_;

    public X1PDeclaration()
    {
    }

    public X1PDeclaration(
        XPDeclaration _xPDeclaration_,
        PDeclaration _pDeclaration_)
    {
        setXPDeclaration(_xPDeclaration_);
        setPDeclaration(_pDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPDeclaration getXPDeclaration()
    {
        return _xPDeclaration_;
    }

    public void setXPDeclaration(XPDeclaration node)
    {
        if(_xPDeclaration_ != null)
        {
            _xPDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPDeclaration_ = node;
    }

    public PDeclaration getPDeclaration()
    {
        return _pDeclaration_;
    }

    public void setPDeclaration(PDeclaration node)
    {
        if(_pDeclaration_ != null)
        {
            _pDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPDeclaration_ == child)
        {
            _xPDeclaration_ = null;
        }

        if(_pDeclaration_ == child)
        {
            _pDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPDeclaration_) +
            toString(_pDeclaration_);
    }
}
