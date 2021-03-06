/**
 * This enum is used for different predicate types, so it is easier later on to add new ones and handle them. 
 */
package semfacet.data.enums;

//TODO: Add all owl types
public enum PredicateTypeEnum {

    UNKNOWN("0"), INTEGER("1"), FLOAT("2");

    private final String text;

    private PredicateTypeEnum(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
