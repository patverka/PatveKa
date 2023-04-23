package com.patverka.patverka.category.domain

import com.patverka.patverka.R

enum class CategoryEnum(val key: String, val imageResKey: String, val titleResKey: Int) {
    TRUCK("truck", "ic_category_truck", R.string.truck),
    CONCRETE_MIXER("concrete_mixer", "ic_category_concrete_mixer", R.string.concrete_mixer),
    TOW_TRUCK("tow_truck", "ic_category_tow_truck", R.string.tow_truck),
    DUMP_TRUCK("dump_truck", "ic_category_dump_truck", R.string.dump_truck),
    EXCAVATOR_CATERPILLAR("excavator_caterpillar", "ic_category_excavator_caterpillar", R.string.excavator_caterpillar),
    WHEELED_EXCAVATOR("wheeled_excavator", "ic_category_wheeled_excavator", R.string.wheeled_excavator),
    BULLDOZER("bulldozer", "ic_category_bulldozer", R.string.bulldozer),
    GLDON("gldon", "ic_category_gldon", R.string.gldon),
    MANIPULATOR("manipulator", "ic_category_manipulator", R.string.manipulator),
    WATER_CAR("water_car", "ic_category_water_car", R.string.water_car),
    GAS_STATION("gas_station", "ic_category_gas_station", R.string.gas_station),
    CAR_TOWER("car_tower", "ic_category_car_tower", R.string.car_tower),
}