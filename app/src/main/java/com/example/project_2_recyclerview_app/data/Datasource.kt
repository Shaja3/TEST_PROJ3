package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Res

class Datasource {
    // list of items
    fun loadRes() : List<Res>{
        return listOf(
            Res(R.string.res1, R.drawable.mc2, R.string.items5),
            Res(R.string.res2, R.drawable.kfc1, R.string.items5),
            Res(R.string.res3, R.drawable.casapasta1, R.string.items5),
            Res(R.string.res4, R.drawable.subway1, R.string.items5),
            Res(R.string.res5, R.drawable.kudo1, R.string.items5),
            Res(R.string.res6, R.drawable.pastalita1, R.string.items5),
            Res(R.string.res7, R.drawable.br1, R.string.items5),
            Res(R.string.res8, R.drawable.herfy2, R.string.items5)

        )
    }
}