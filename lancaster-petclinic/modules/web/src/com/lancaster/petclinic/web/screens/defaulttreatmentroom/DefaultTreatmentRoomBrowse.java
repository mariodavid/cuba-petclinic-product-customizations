package com.lancaster.petclinic.web.screens.defaulttreatmentroom;

import com.haulmont.cuba.gui.screen.*;
import com.lancaster.petclinic.entity.DefaultTreatmentRoom;

@UiController("lancasterpetclinic_DefaultTreatmentRoom.browse")
@UiDescriptor("default-treatment-room-browse.xml")
@LookupComponent("defaultTreatmentRoomsTable")
@LoadDataBeforeShow
public class DefaultTreatmentRoomBrowse extends StandardLookup<DefaultTreatmentRoom> {
}