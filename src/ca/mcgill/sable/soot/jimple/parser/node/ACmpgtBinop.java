package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class ACmpgtBinop extends PBinop
{
    private TCmpgt _cmpgt_;

    public ACmpgtBinop()
    {
    }

    public ACmpgtBinop(
        TCmpgt _cmpgt_)
    {
        setCmpgt(_cmpgt_);

    }
    public Object clone()
    {
        return new ACmpgtBinop(
            (TCmpgt) cloneNode(_cmpgt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpgtBinop(this);
    }

    public TCmpgt getCmpgt()
    {
        return _cmpgt_;
    }

    public void setCmpgt(TCmpgt node)
    {
        if(_cmpgt_ != null)
        {
            _cmpgt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _cmpgt_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_cmpgt_);
    }

    void removeChild(Node child)
    {
        if(_cmpgt_ == child)
        {
            _cmpgt_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_cmpgt_ == oldChild)
        {
            setCmpgt((TCmpgt) newChild);
            return;
        }

    }
}
