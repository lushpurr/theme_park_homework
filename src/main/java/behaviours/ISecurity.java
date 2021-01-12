package behaviours;

import people.Visitor;

public interface ISecurity {

    boolean isAllowedVisitor(Visitor visitor);
}
