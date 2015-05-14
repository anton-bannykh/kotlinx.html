package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class RP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("rp", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, PhrasingContent {

}

public open class RT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("rt", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, PhrasingContent {

}

public open class RUBY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ruby", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, PhrasingContent {

}
fun RUBY.rt(block : RT.() -> Unit) : Unit = buildRT(emptyMap(), consumer, block)

fun RUBY.rp(block : RP.() -> Unit) : Unit = buildRP(emptyMap(), consumer, block)


