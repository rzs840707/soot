package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ANameBaseType extends PBaseType
{
    private PQualifiedName _qualifiedName_;

    public ANameBaseType()
    {
    }

    public ANameBaseType(
        PQualifiedName _qualifiedName_)
    {
        setQualifiedName(_qualifiedName_);

    }
    public Object clone()
    {
        return new ANameBaseType(
            (PQualifiedName) cloneNode(_qualifiedName_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANameBaseType(this);
    }

    public PQualifiedName getQualifiedName()
    {
        return _qualifiedName_;
    }

    public void setQualifiedName(PQualifiedName node)
    {
        if(_qualifiedName_ != null)
        {
            _qualifiedName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _qualifiedName_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_qualifiedName_);
    }

    void removeChild(Node child)
    {
        if(_qualifiedName_ == child)
        {
            _qualifiedName_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_qualifiedName_ == oldChild)
        {
            setQualifiedName((PQualifiedName) newChild);
            return;
        }

    }
}
