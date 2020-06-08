package com.lancaster.petclinic.web.screens.treatmentroom;

import com.haulmont.cuba.gui.screen.*;
import com.lancaster.petclinic.entity.TreatmentRoom;

@UiController("lancasterpetclinic_TreatmentRoom.edit")
@UiDescriptor("treatment-room-edit.xml")
@EditedEntityContainer("treatmentRoomDc")
@LoadDataBeforeShow
public class TreatmentRoomEdit extends StandardEditor<TreatmentRoom> {
}