package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class Q(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("q", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, PhrasingContent {
    var cite : String
        get()  = attributeString_5f39f85b.get(this, "cite")
        set(newValue) {attributeString_5f39f85b.set(this, "cite", newValue)}


}

