package ca.mcgill.sable.soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import ca.mcgill.sable.soot.jimple.parser.analysis.*;

public final class TVoid extends Token
{
    public TVoid()
    {
        super.setText("void");
    }

    public TVoid(int line, int pos)
    {
        super.setText("void");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVoid(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVoid(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TVoid text.");
    }
}
