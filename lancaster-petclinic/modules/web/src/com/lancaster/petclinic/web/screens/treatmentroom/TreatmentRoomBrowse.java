package com.lancaster.petclinic.web.screens.treatmentroom;

import com.haulmont.cuba.gui.screen.*;
import com.lancaster.petclinic.entity.TreatmentRoom;

@UiController("lancasterpetclinic_TreatmentRoom.browse")
@UiDescriptor("treatment-room-browse.xml")
@LookupComponent("treatmentRoomsTable")
@LoadDataBeforeShow
public class TreatmentRoomBrowse extends StandardLookup<TreatmentRoom> {
}