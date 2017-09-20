/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package streamwithcontenttype.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContentTypes.
 */
public final class ContentTypes extends ExpandableStringEnum<ContentTypes> {
    /** Static value text/plain for ContentTypes. */
    public static final ContentTypes TEXTPLAIN = fromString("text/plain");

    /** Static value text/json for ContentTypes. */
    public static final ContentTypes TEXTJSON = fromString("text/json");

    /** Static value text/xml for ContentTypes. */
    public static final ContentTypes TEXTXML = fromString("text/xml");

    /**
     * Creates or finds a ContentTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ContentTypes
     */
    @JsonCreator
    public static ContentTypes fromString(String name) {
        return fromString(name, ContentTypes.class);
    }

    /**
     * @return known ContentTypes values
     */
    public static Collection<ContentTypes> values() {
        return values(ContentTypes.class);
    }
}