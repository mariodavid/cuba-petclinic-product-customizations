package com.lancaster.petclinic.web.screens.defaulttreatmentroom;

import com.haulmont.cuba.gui.screen.*;
import com.lancaster.petclinic.entity.DefaultTreatmentRoom;

@UiController("lancasterpetclinic_DefaultTreatmentRoom.edit")
@UiDescriptor("default-treatment-room-edit.xml")
@EditedEntityContainer("defaultTreatmentRoomDc")
@LoadDataBeforeShow
public class DefaultTreatmentRoomEdit extends StandardEditor<DefaultTreatmentRoom> {
}