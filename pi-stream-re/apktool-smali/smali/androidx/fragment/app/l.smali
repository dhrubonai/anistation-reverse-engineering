.class public final Landroidx/fragment/app/l;
.super Landroidx/fragment/app/n1;
.source "SourceFile"


# direct methods
.method public static i(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/c1;->b(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, p1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-static {p0, v2}, Landroidx/fragment/app/l;->i(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_1
    return-void
.end method

.method public static j(Ln/e;Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v2}, Landroidx/fragment/app/l;->j(Ln/e;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public static k(Ln/e;Ljava/util/Collection;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln/e;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lr6/w;

    .line 6
    .line 7
    invoke-virtual {p0}, Lr6/w;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 30
    .line 31
    invoke-static {v0}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;Z)V
    .locals 36

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v10, 0x0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v11, 0x3

    .line 16
    const/4 v12, 0x2

    .line 17
    const/4 v13, 0x1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/fragment/app/m1;

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 29
    .line 30
    invoke-static {v2}, La3/g;->d(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, v1, Landroidx/fragment/app/m1;->a:I

    .line 35
    .line 36
    invoke-static {v3}, Lp/j;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    if-eq v3, v13, :cond_1

    .line 43
    .line 44
    if-eq v3, v12, :cond_2

    .line 45
    .line 46
    if-eq v3, v11, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-eq v2, v12, :cond_0

    .line 50
    .line 51
    move-object v10, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    if-ne v2, v12, :cond_0

    .line 54
    .line 55
    if-nez v9, :cond_0

    .line 56
    .line 57
    move-object v9, v1

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static {v12}, Landroidx/fragment/app/s0;->H(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const-string v14, " to "

    .line 64
    .line 65
    const-string v15, "FragmentManager"

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v1, "Executing operations from "

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v3, Ljava/util/ArrayList;

    .line 103
    .line 104
    move-object/from16 v0, p1

    .line 105
    .line 106
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Landroidx/fragment/app/m1;

    .line 124
    .line 125
    new-instance v13, Lc0/d;

    .line 126
    .line 127
    invoke-direct {v13}, Lc0/d;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Landroidx/fragment/app/m1;->d()V

    .line 131
    .line 132
    .line 133
    iget-object v8, v1, Landroidx/fragment/app/m1;->e:Ljava/util/HashSet;

    .line 134
    .line 135
    invoke-virtual {v8, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    new-instance v8, Landroidx/fragment/app/j;

    .line 139
    .line 140
    invoke-direct {v8, v1, v13, v7}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/m1;Lc0/d;Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    new-instance v8, Lc0/d;

    .line 147
    .line 148
    invoke-direct {v8}, Lc0/d;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Landroidx/fragment/app/m1;->d()V

    .line 152
    .line 153
    .line 154
    iget-object v13, v1, Landroidx/fragment/app/m1;->e:Ljava/util/HashSet;

    .line 155
    .line 156
    invoke-virtual {v13, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    new-instance v13, Landroidx/fragment/app/k;

    .line 160
    .line 161
    if-eqz v7, :cond_5

    .line 162
    .line 163
    if-ne v1, v9, :cond_6

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    if-ne v1, v10, :cond_6

    .line 167
    .line 168
    :goto_2
    const/4 v2, 0x1

    .line 169
    goto :goto_3

    .line 170
    :cond_6
    const/4 v2, 0x0

    .line 171
    :goto_3
    invoke-direct {v13, v1, v8, v7, v2}, Landroidx/fragment/app/k;-><init>(Landroidx/fragment/app/m1;Lc0/d;ZZ)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    new-instance v2, Ld0/a;

    .line 178
    .line 179
    invoke-direct {v2, v6, v3, v1, v11}, Ld0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    iget-object v1, v1, Landroidx/fragment/app/m1;->d:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    const/4 v13, 0x1

    .line 188
    goto :goto_1

    .line 189
    :cond_7
    new-instance v8, Ljava/util/HashMap;

    .line 190
    .line 191
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const/4 v13, 0x0

    .line 199
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_f

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Landroidx/fragment/app/k;

    .line 210
    .line 211
    invoke-virtual {v1}, Lf/d0;->e()Z

    .line 212
    .line 213
    .line 214
    move-result v17

    .line 215
    if-eqz v17, :cond_8

    .line 216
    .line 217
    move-object/from16 v17, v0

    .line 218
    .line 219
    move-object/from16 v18, v3

    .line 220
    .line 221
    move-object/from16 v19, v5

    .line 222
    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :cond_8
    iget-object v11, v1, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 226
    .line 227
    invoke-virtual {v1, v11}, Landroidx/fragment/app/k;->h(Ljava/lang/Object;)Landroidx/fragment/app/i1;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget-object v12, v1, Landroidx/fragment/app/k;->e:Ljava/lang/Object;

    .line 232
    .line 233
    move-object/from16 v17, v0

    .line 234
    .line 235
    invoke-virtual {v1, v12}, Landroidx/fragment/app/k;->h(Ljava/lang/Object;)Landroidx/fragment/app/i1;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    move-object/from16 v18, v3

    .line 240
    .line 241
    const-string v3, " returned Transition "

    .line 242
    .line 243
    move-object/from16 v19, v5

    .line 244
    .line 245
    const-string v5, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 246
    .line 247
    if-eqz v2, :cond_a

    .line 248
    .line 249
    if-eqz v0, :cond_a

    .line 250
    .line 251
    if-ne v2, v0, :cond_9

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 255
    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget-object v1, v1, Lf/d0;->a:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Landroidx/fragment/app/m1;

    .line 264
    .line 265
    iget-object v1, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 266
    .line 267
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v1, " which uses a different Transition  type than its shared element transition "

    .line 277
    .line 278
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw v0

    .line 292
    :cond_a
    :goto_5
    if-eqz v2, :cond_b

    .line 293
    .line 294
    move-object v0, v2

    .line 295
    :cond_b
    if-nez v13, :cond_c

    .line 296
    .line 297
    move-object v13, v0

    .line 298
    goto :goto_6

    .line 299
    :cond_c
    if-eqz v0, :cond_e

    .line 300
    .line 301
    if-ne v13, v0, :cond_d

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 305
    .line 306
    new-instance v2, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-object v1, v1, Lf/d0;->a:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Landroidx/fragment/app/m1;

    .line 314
    .line 315
    iget-object v1, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 316
    .line 317
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    const-string v1, " which uses a different Transition  type than other Fragments."

    .line 327
    .line 328
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v0

    .line 339
    :cond_e
    :goto_6
    move-object/from16 v0, v17

    .line 340
    .line 341
    move-object/from16 v3, v18

    .line 342
    .line 343
    move-object/from16 v5, v19

    .line 344
    .line 345
    const/4 v11, 0x3

    .line 346
    const/4 v12, 0x2

    .line 347
    goto/16 :goto_4

    .line 348
    .line 349
    :cond_f
    move-object/from16 v18, v3

    .line 350
    .line 351
    move-object/from16 v19, v5

    .line 352
    .line 353
    iget-object v12, v6, Landroidx/fragment/app/n1;->a:Landroid/view/ViewGroup;

    .line 354
    .line 355
    if-nez v13, :cond_11

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_10

    .line 366
    .line 367
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    check-cast v1, Landroidx/fragment/app/k;

    .line 372
    .line 373
    iget-object v2, v1, Lf/d0;->a:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, Landroidx/fragment/app/m1;

    .line 376
    .line 377
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 378
    .line 379
    invoke-virtual {v8, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Lf/d0;->b()V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_10
    move-object v2, v8

    .line 387
    move-object/from16 v34, v9

    .line 388
    .line 389
    move-object/from16 v32, v10

    .line 390
    .line 391
    move-object/from16 v29, v14

    .line 392
    .line 393
    move-object/from16 v33, v18

    .line 394
    .line 395
    move-object/from16 v31, v19

    .line 396
    .line 397
    :goto_8
    const/4 v3, 0x0

    .line 398
    goto/16 :goto_27

    .line 399
    .line 400
    :cond_11
    new-instance v5, Landroid/view/View;

    .line 401
    .line 402
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 407
    .line 408
    .line 409
    new-instance v3, Landroid/graphics/Rect;

    .line 410
    .line 411
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 412
    .line 413
    .line 414
    new-instance v2, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 417
    .line 418
    .line 419
    new-instance v1, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    new-instance v0, Ln/e;

    .line 425
    .line 426
    invoke-direct {v0}, Ln/e;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 430
    .line 431
    .line 432
    move-result-object v23

    .line 433
    move-object/from16 v17, v3

    .line 434
    .line 435
    move-object/from16 v20, v4

    .line 436
    .line 437
    move-object/from16 v21, v5

    .line 438
    .line 439
    move-object v3, v9

    .line 440
    move-object v4, v10

    .line 441
    const/4 v5, 0x0

    .line 442
    const/4 v11, 0x0

    .line 443
    const/16 v24, 0x0

    .line 444
    .line 445
    :goto_9
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v22

    .line 449
    if-eqz v22, :cond_26

    .line 450
    .line 451
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v22

    .line 455
    move-object/from16 v29, v14

    .line 456
    .line 457
    move-object/from16 v14, v22

    .line 458
    .line 459
    check-cast v14, Landroidx/fragment/app/k;

    .line 460
    .line 461
    iget-object v14, v14, Landroidx/fragment/app/k;->e:Ljava/lang/Object;

    .line 462
    .line 463
    if-eqz v14, :cond_12

    .line 464
    .line 465
    const/16 v22, 0x1

    .line 466
    .line 467
    goto :goto_a

    .line 468
    :cond_12
    const/16 v22, 0x0

    .line 469
    .line 470
    :goto_a
    if-eqz v22, :cond_25

    .line 471
    .line 472
    if-eqz v3, :cond_25

    .line 473
    .line 474
    if-eqz v4, :cond_25

    .line 475
    .line 476
    invoke-virtual {v13, v14}, Landroidx/fragment/app/i1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    invoke-virtual {v13, v5}, Landroidx/fragment/app/i1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v14

    .line 484
    iget-object v4, v4, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 485
    .line 486
    iget-object v5, v4, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 487
    .line 488
    if-eqz v5, :cond_13

    .line 489
    .line 490
    iget-object v5, v5, Landroidx/fragment/app/v;->g:Ljava/util/ArrayList;

    .line 491
    .line 492
    if-nez v5, :cond_14

    .line 493
    .line 494
    :cond_13
    new-instance v5, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 497
    .line 498
    .line 499
    :cond_14
    iget-object v3, v3, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 500
    .line 501
    move-object/from16 v25, v11

    .line 502
    .line 503
    iget-object v11, v3, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 504
    .line 505
    if-eqz v11, :cond_15

    .line 506
    .line 507
    iget-object v11, v11, Landroidx/fragment/app/v;->g:Ljava/util/ArrayList;

    .line 508
    .line 509
    if-nez v11, :cond_16

    .line 510
    .line 511
    :cond_15
    new-instance v11, Ljava/util/ArrayList;

    .line 512
    .line 513
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 514
    .line 515
    .line 516
    :cond_16
    iget-object v6, v3, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 517
    .line 518
    if-eqz v6, :cond_17

    .line 519
    .line 520
    iget-object v6, v6, Landroidx/fragment/app/v;->h:Ljava/util/ArrayList;

    .line 521
    .line 522
    if-nez v6, :cond_18

    .line 523
    .line 524
    :cond_17
    new-instance v6, Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 527
    .line 528
    .line 529
    :cond_18
    move-object/from16 v30, v8

    .line 530
    .line 531
    move-object/from16 v31, v13

    .line 532
    .line 533
    const/4 v8, 0x0

    .line 534
    :goto_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 535
    .line 536
    .line 537
    move-result v13

    .line 538
    move-object/from16 v26, v14

    .line 539
    .line 540
    const/4 v14, -0x1

    .line 541
    if-ge v8, v13, :cond_1a

    .line 542
    .line 543
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v13

    .line 547
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    if-eq v13, v14, :cond_19

    .line 552
    .line 553
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v14

    .line 557
    check-cast v14, Ljava/lang/String;

    .line 558
    .line 559
    invoke-virtual {v5, v13, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    :cond_19
    add-int/lit8 v8, v8, 0x1

    .line 563
    .line 564
    move-object/from16 v14, v26

    .line 565
    .line 566
    goto :goto_b

    .line 567
    :cond_1a
    iget-object v6, v4, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 568
    .line 569
    if-eqz v6, :cond_1b

    .line 570
    .line 571
    iget-object v6, v6, Landroidx/fragment/app/v;->h:Ljava/util/ArrayList;

    .line 572
    .line 573
    if-nez v6, :cond_1c

    .line 574
    .line 575
    :cond_1b
    new-instance v6, Ljava/util/ArrayList;

    .line 576
    .line 577
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 578
    .line 579
    .line 580
    :cond_1c
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    const/4 v11, 0x0

    .line 585
    :goto_c
    if-ge v11, v8, :cond_1d

    .line 586
    .line 587
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v13

    .line 591
    check-cast v13, Ljava/lang/String;

    .line 592
    .line 593
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v22

    .line 597
    move-object/from16 v14, v22

    .line 598
    .line 599
    check-cast v14, Ljava/lang/String;

    .line 600
    .line 601
    invoke-virtual {v0, v13, v14}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    add-int/lit8 v11, v11, 0x1

    .line 605
    .line 606
    const/4 v14, -0x1

    .line 607
    goto :goto_c

    .line 608
    :cond_1d
    const/4 v11, 0x2

    .line 609
    invoke-static {v11}, Landroidx/fragment/app/s0;->H(I)Z

    .line 610
    .line 611
    .line 612
    move-result v8

    .line 613
    if-eqz v8, :cond_1f

    .line 614
    .line 615
    const-string v8, ">>> entering view names <<<"

    .line 616
    .line 617
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    .line 619
    .line 620
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v8

    .line 624
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v11

    .line 628
    const-string v13, "Name: "

    .line 629
    .line 630
    if-eqz v11, :cond_1e

    .line 631
    .line 632
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v11

    .line 636
    check-cast v11, Ljava/lang/String;

    .line 637
    .line 638
    new-instance v14, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v11

    .line 650
    invoke-static {v15, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 651
    .line 652
    .line 653
    goto :goto_d

    .line 654
    :cond_1e
    const-string v8, ">>> exiting view names <<<"

    .line 655
    .line 656
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 657
    .line 658
    .line 659
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v11

    .line 667
    if-eqz v11, :cond_1f

    .line 668
    .line 669
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v11

    .line 673
    check-cast v11, Ljava/lang/String;

    .line 674
    .line 675
    new-instance v14, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v11

    .line 687
    invoke-static {v15, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 688
    .line 689
    .line 690
    goto :goto_e

    .line 691
    :cond_1f
    new-instance v8, Ln/e;

    .line 692
    .line 693
    invoke-direct {v8}, Ln/e;-><init>()V

    .line 694
    .line 695
    .line 696
    iget-object v3, v3, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 697
    .line 698
    invoke-static {v8, v3}, Landroidx/fragment/app/l;->j(Ln/e;Landroid/view/View;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v8, v5}, Ln/e;->m(Ljava/util/Collection;)Z

    .line 702
    .line 703
    .line 704
    invoke-virtual {v8}, Ln/e;->keySet()Ljava/util/Set;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    invoke-virtual {v0, v3}, Ln/e;->m(Ljava/util/Collection;)Z

    .line 709
    .line 710
    .line 711
    new-instance v3, Ln/e;

    .line 712
    .line 713
    invoke-direct {v3}, Ln/e;-><init>()V

    .line 714
    .line 715
    .line 716
    iget-object v4, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 717
    .line 718
    invoke-static {v3, v4}, Landroidx/fragment/app/l;->j(Ln/e;Landroid/view/View;)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v3, v6}, Ln/e;->m(Ljava/util/Collection;)Z

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Ln/e;->values()Ljava/util/Collection;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-virtual {v3, v4}, Ln/e;->m(Ljava/util/Collection;)Z

    .line 729
    .line 730
    .line 731
    sget-object v4, Landroidx/fragment/app/b1;->a:Landroidx/fragment/app/g1;

    .line 732
    .line 733
    iget v4, v0, Ln/k;->c:I

    .line 734
    .line 735
    const/4 v11, -0x1

    .line 736
    add-int/2addr v4, v11

    .line 737
    :goto_f
    if-ltz v4, :cond_21

    .line 738
    .line 739
    invoke-virtual {v0, v4}, Ln/k;->l(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    check-cast v11, Ljava/lang/String;

    .line 744
    .line 745
    invoke-virtual {v3, v11}, Ln/k;->containsKey(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v11

    .line 749
    if-nez v11, :cond_20

    .line 750
    .line 751
    invoke-virtual {v0, v4}, Ln/k;->j(I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    :cond_20
    add-int/lit8 v4, v4, -0x1

    .line 755
    .line 756
    goto :goto_f

    .line 757
    :cond_21
    invoke-virtual {v0}, Ln/e;->keySet()Ljava/util/Set;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    invoke-static {v8, v4}, Landroidx/fragment/app/l;->k(Ln/e;Ljava/util/Collection;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v0}, Ln/e;->values()Ljava/util/Collection;

    .line 765
    .line 766
    .line 767
    move-result-object v4

    .line 768
    invoke-static {v3, v4}, Landroidx/fragment/app/l;->k(Ln/e;Ljava/util/Collection;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0}, Ln/k;->isEmpty()Z

    .line 772
    .line 773
    .line 774
    move-result v4

    .line 775
    if-eqz v4, :cond_22

    .line 776
    .line 777
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 781
    .line 782
    .line 783
    move-object v11, v0

    .line 784
    move-object v14, v1

    .line 785
    move-object v0, v2

    .line 786
    move-object v3, v9

    .line 787
    move-object v4, v10

    .line 788
    move-object/from16 p1, v17

    .line 789
    .line 790
    move-object/from16 v33, v18

    .line 791
    .line 792
    move-object/from16 v26, v20

    .line 793
    .line 794
    move-object/from16 v7, v21

    .line 795
    .line 796
    move-object/from16 v2, v30

    .line 797
    .line 798
    move-object/from16 v13, v31

    .line 799
    .line 800
    const/4 v5, 0x0

    .line 801
    move-object/from16 v31, v19

    .line 802
    .line 803
    goto/16 :goto_12

    .line 804
    .line 805
    :cond_22
    new-instance v4, Landroidx/fragment/app/h;

    .line 806
    .line 807
    invoke-direct {v4, v10, v9, v7, v3}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/m1;Landroidx/fragment/app/m1;ZLn/e;)V

    .line 808
    .line 809
    .line 810
    invoke-static {v12, v4}, Lg0/b0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v8}, Ln/e;->values()Ljava/util/Collection;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 818
    .line 819
    .line 820
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    if-nez v4, :cond_23

    .line 825
    .line 826
    const/4 v4, 0x0

    .line 827
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v5

    .line 831
    check-cast v5, Ljava/lang/String;

    .line 832
    .line 833
    const/4 v11, 0x0

    .line 834
    invoke-virtual {v8, v5, v11}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v5

    .line 838
    check-cast v5, Landroid/view/View;

    .line 839
    .line 840
    move-object/from16 v8, v26

    .line 841
    .line 842
    move-object/from16 v13, v31

    .line 843
    .line 844
    invoke-virtual {v13, v5, v8}, Landroidx/fragment/app/i1;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    move-object/from16 v25, v5

    .line 848
    .line 849
    goto :goto_10

    .line 850
    :cond_23
    move-object/from16 v8, v26

    .line 851
    .line 852
    move-object/from16 v13, v31

    .line 853
    .line 854
    const/4 v4, 0x0

    .line 855
    const/4 v11, 0x0

    .line 856
    :goto_10
    invoke-virtual {v3}, Ln/e;->values()Ljava/util/Collection;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 861
    .line 862
    .line 863
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 864
    .line 865
    .line 866
    move-result v5

    .line 867
    if-nez v5, :cond_24

    .line 868
    .line 869
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v5

    .line 873
    check-cast v5, Ljava/lang/String;

    .line 874
    .line 875
    invoke-virtual {v3, v5, v11}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    check-cast v3, Landroid/view/View;

    .line 880
    .line 881
    if-eqz v3, :cond_24

    .line 882
    .line 883
    new-instance v6, Lj/g;

    .line 884
    .line 885
    const/4 v5, 0x1

    .line 886
    move-object v11, v0

    .line 887
    move-object v0, v6

    .line 888
    move-object v14, v1

    .line 889
    move-object/from16 v1, p0

    .line 890
    .line 891
    move-object/from16 v32, v2

    .line 892
    .line 893
    move-object v2, v13

    .line 894
    move-object/from16 p1, v17

    .line 895
    .line 896
    move-object/from16 v33, v18

    .line 897
    .line 898
    move v7, v4

    .line 899
    move-object/from16 v26, v20

    .line 900
    .line 901
    move-object/from16 v4, p1

    .line 902
    .line 903
    move-object/from16 v31, v19

    .line 904
    .line 905
    move-object/from16 v7, v21

    .line 906
    .line 907
    invoke-direct/range {v0 .. v5}, Lj/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 908
    .line 909
    .line 910
    invoke-static {v12, v6}, Lg0/b0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 911
    .line 912
    .line 913
    move-object/from16 v0, v32

    .line 914
    .line 915
    const/16 v24, 0x1

    .line 916
    .line 917
    goto :goto_11

    .line 918
    :cond_24
    move-object v11, v0

    .line 919
    move-object v14, v1

    .line 920
    move-object/from16 v32, v2

    .line 921
    .line 922
    move-object/from16 p1, v17

    .line 923
    .line 924
    move-object/from16 v33, v18

    .line 925
    .line 926
    move-object/from16 v31, v19

    .line 927
    .line 928
    move-object/from16 v26, v20

    .line 929
    .line 930
    move-object/from16 v7, v21

    .line 931
    .line 932
    move-object/from16 v0, v32

    .line 933
    .line 934
    :goto_11
    invoke-virtual {v13, v8, v7, v0}, Landroidx/fragment/app/i1;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 935
    .line 936
    .line 937
    const/16 v19, 0x0

    .line 938
    .line 939
    const/16 v20, 0x0

    .line 940
    .line 941
    move-object/from16 v17, v13

    .line 942
    .line 943
    move-object/from16 v18, v8

    .line 944
    .line 945
    move-object/from16 v21, v8

    .line 946
    .line 947
    move-object/from16 v22, v14

    .line 948
    .line 949
    invoke-virtual/range {v17 .. v22}, Landroidx/fragment/app/i1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 950
    .line 951
    .line 952
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 953
    .line 954
    move-object/from16 v2, v30

    .line 955
    .line 956
    invoke-virtual {v2, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v2, v10, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-object v5, v8

    .line 963
    move-object v3, v9

    .line 964
    move-object v4, v10

    .line 965
    goto :goto_12

    .line 966
    :cond_25
    move-object v14, v1

    .line 967
    move-object/from16 v25, v11

    .line 968
    .line 969
    move-object/from16 p1, v17

    .line 970
    .line 971
    move-object/from16 v33, v18

    .line 972
    .line 973
    move-object/from16 v31, v19

    .line 974
    .line 975
    move-object/from16 v26, v20

    .line 976
    .line 977
    move-object/from16 v7, v21

    .line 978
    .line 979
    move-object v11, v0

    .line 980
    move-object v0, v2

    .line 981
    move-object v2, v8

    .line 982
    :goto_12
    move-object/from16 v6, p0

    .line 983
    .line 984
    move-object/from16 v17, p1

    .line 985
    .line 986
    move-object v8, v2

    .line 987
    move-object/from16 v21, v7

    .line 988
    .line 989
    move-object v1, v14

    .line 990
    move-object/from16 v20, v26

    .line 991
    .line 992
    move-object/from16 v14, v29

    .line 993
    .line 994
    move-object/from16 v19, v31

    .line 995
    .line 996
    move-object/from16 v18, v33

    .line 997
    .line 998
    move/from16 v7, p2

    .line 999
    .line 1000
    move-object v2, v0

    .line 1001
    move-object v0, v11

    .line 1002
    move-object/from16 v11, v25

    .line 1003
    .line 1004
    goto/16 :goto_9

    .line 1005
    .line 1006
    :cond_26
    move-object/from16 v25, v11

    .line 1007
    .line 1008
    move-object/from16 v29, v14

    .line 1009
    .line 1010
    move-object/from16 p1, v17

    .line 1011
    .line 1012
    move-object/from16 v33, v18

    .line 1013
    .line 1014
    move-object/from16 v31, v19

    .line 1015
    .line 1016
    move-object/from16 v26, v20

    .line 1017
    .line 1018
    move-object/from16 v7, v21

    .line 1019
    .line 1020
    move-object v11, v0

    .line 1021
    move-object v14, v1

    .line 1022
    move-object v0, v2

    .line 1023
    move-object v2, v8

    .line 1024
    new-instance v1, Ljava/util/ArrayList;

    .line 1025
    .line 1026
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v6

    .line 1033
    move-object/from16 v23, v11

    .line 1034
    .line 1035
    const/4 v8, 0x0

    .line 1036
    const/4 v11, 0x0

    .line 1037
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v17

    .line 1041
    if-eqz v17, :cond_33

    .line 1042
    .line 1043
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v17

    .line 1047
    move-object/from16 p2, v6

    .line 1048
    .line 1049
    move-object/from16 v6, v17

    .line 1050
    .line 1051
    check-cast v6, Landroidx/fragment/app/k;

    .line 1052
    .line 1053
    invoke-virtual {v6}, Lf/d0;->e()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v17

    .line 1057
    if-eqz v17, :cond_27

    .line 1058
    .line 1059
    move-object/from16 v30, v15

    .line 1060
    .line 1061
    iget-object v15, v6, Lf/d0;->a:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v15, Landroidx/fragment/app/m1;

    .line 1064
    .line 1065
    move-object/from16 v32, v10

    .line 1066
    .line 1067
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1068
    .line 1069
    invoke-virtual {v2, v15, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v6}, Lf/d0;->b()V

    .line 1073
    .line 1074
    .line 1075
    move-object v6, v3

    .line 1076
    move-object/from16 v35, v5

    .line 1077
    .line 1078
    move-object/from16 v21, v7

    .line 1079
    .line 1080
    move-object/from16 v34, v9

    .line 1081
    .line 1082
    move-object/from16 v5, v33

    .line 1083
    .line 1084
    move-object/from16 v7, p0

    .line 1085
    .line 1086
    move-object/from16 v3, p1

    .line 1087
    .line 1088
    move-object v9, v8

    .line 1089
    move-object v8, v4

    .line 1090
    move-object/from16 v4, v25

    .line 1091
    .line 1092
    goto/16 :goto_1a

    .line 1093
    .line 1094
    :cond_27
    move-object/from16 v32, v10

    .line 1095
    .line 1096
    move-object/from16 v30, v15

    .line 1097
    .line 1098
    iget-object v10, v6, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 1099
    .line 1100
    invoke-virtual {v13, v10}, Landroidx/fragment/app/i1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v10

    .line 1104
    iget-object v15, v6, Lf/d0;->a:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v15, Landroidx/fragment/app/m1;

    .line 1107
    .line 1108
    if-eqz v5, :cond_29

    .line 1109
    .line 1110
    if-eq v15, v3, :cond_28

    .line 1111
    .line 1112
    if-ne v15, v4, :cond_29

    .line 1113
    .line 1114
    :cond_28
    const/4 v4, 0x1

    .line 1115
    goto :goto_14

    .line 1116
    :cond_29
    const/4 v4, 0x0

    .line 1117
    :goto_14
    if-nez v10, :cond_2b

    .line 1118
    .line 1119
    if-nez v4, :cond_2a

    .line 1120
    .line 1121
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1122
    .line 1123
    invoke-virtual {v2, v15, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v6}, Lf/d0;->b()V

    .line 1127
    .line 1128
    .line 1129
    :cond_2a
    move-object/from16 v3, p1

    .line 1130
    .line 1131
    move-object/from16 v35, v5

    .line 1132
    .line 1133
    move-object/from16 v21, v7

    .line 1134
    .line 1135
    move-object/from16 v34, v9

    .line 1136
    .line 1137
    move-object/from16 v4, v25

    .line 1138
    .line 1139
    move-object/from16 v5, v33

    .line 1140
    .line 1141
    move-object/from16 v7, p0

    .line 1142
    .line 1143
    goto/16 :goto_19

    .line 1144
    .line 1145
    :cond_2b
    move-object/from16 v34, v9

    .line 1146
    .line 1147
    new-instance v9, Ljava/util/ArrayList;

    .line 1148
    .line 1149
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    move-object/from16 v35, v5

    .line 1153
    .line 1154
    iget-object v5, v15, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 1155
    .line 1156
    iget-object v5, v5, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 1157
    .line 1158
    invoke-static {v9, v5}, Landroidx/fragment/app/l;->i(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 1159
    .line 1160
    .line 1161
    if-eqz v4, :cond_2d

    .line 1162
    .line 1163
    if-ne v15, v3, :cond_2c

    .line 1164
    .line 1165
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 1166
    .line 1167
    .line 1168
    goto :goto_15

    .line 1169
    :cond_2c
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 1170
    .line 1171
    .line 1172
    :cond_2d
    :goto_15
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1173
    .line 1174
    .line 1175
    move-result v3

    .line 1176
    if-eqz v3, :cond_2f

    .line 1177
    .line 1178
    invoke-virtual {v13, v7, v10}, Landroidx/fragment/app/i1;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 1179
    .line 1180
    .line 1181
    :cond_2e
    move-object/from16 v21, v7

    .line 1182
    .line 1183
    move-object/from16 v5, v33

    .line 1184
    .line 1185
    move-object/from16 v7, p0

    .line 1186
    .line 1187
    goto :goto_16

    .line 1188
    :cond_2f
    invoke-virtual {v13, v10, v9}, Landroidx/fragment/app/i1;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1189
    .line 1190
    .line 1191
    const/16 v21, 0x0

    .line 1192
    .line 1193
    const/16 v22, 0x0

    .line 1194
    .line 1195
    move-object/from16 v17, v13

    .line 1196
    .line 1197
    move-object/from16 v18, v10

    .line 1198
    .line 1199
    move-object/from16 v19, v10

    .line 1200
    .line 1201
    move-object/from16 v20, v9

    .line 1202
    .line 1203
    invoke-virtual/range {v17 .. v22}, Landroidx/fragment/app/i1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1204
    .line 1205
    .line 1206
    iget v3, v15, Landroidx/fragment/app/m1;->a:I

    .line 1207
    .line 1208
    const/4 v4, 0x3

    .line 1209
    if-ne v3, v4, :cond_2e

    .line 1210
    .line 1211
    move-object/from16 v5, v33

    .line 1212
    .line 1213
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    new-instance v3, Ljava/util/ArrayList;

    .line 1217
    .line 1218
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1219
    .line 1220
    .line 1221
    iget-object v4, v15, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 1222
    .line 1223
    move-object/from16 v21, v7

    .line 1224
    .line 1225
    iget-object v7, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 1226
    .line 1227
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    iget-object v4, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 1231
    .line 1232
    invoke-virtual {v13, v10, v4, v3}, Landroidx/fragment/app/i1;->k(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 1233
    .line 1234
    .line 1235
    new-instance v3, Landroidx/fragment/app/i;

    .line 1236
    .line 1237
    const/4 v4, 0x0

    .line 1238
    move-object/from16 v7, p0

    .line 1239
    .line 1240
    invoke-direct {v3, v4, v7, v9}, Landroidx/fragment/app/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1241
    .line 1242
    .line 1243
    invoke-static {v12, v3}, Lg0/b0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1244
    .line 1245
    .line 1246
    :goto_16
    iget v3, v15, Landroidx/fragment/app/m1;->a:I

    .line 1247
    .line 1248
    const/4 v4, 0x2

    .line 1249
    if-ne v3, v4, :cond_31

    .line 1250
    .line 1251
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1252
    .line 1253
    .line 1254
    if-eqz v24, :cond_30

    .line 1255
    .line 1256
    move-object/from16 v3, p1

    .line 1257
    .line 1258
    invoke-virtual {v13, v10, v3}, Landroidx/fragment/app/i1;->n(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_17

    .line 1262
    :cond_30
    move-object/from16 v3, p1

    .line 1263
    .line 1264
    :goto_17
    move-object/from16 v4, v25

    .line 1265
    .line 1266
    goto :goto_18

    .line 1267
    :cond_31
    move-object/from16 v3, p1

    .line 1268
    .line 1269
    move-object/from16 v4, v25

    .line 1270
    .line 1271
    invoke-virtual {v13, v4, v10}, Landroidx/fragment/app/i1;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 1272
    .line 1273
    .line 1274
    :goto_18
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1275
    .line 1276
    invoke-virtual {v2, v15, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    iget-boolean v6, v6, Landroidx/fragment/app/k;->d:Z

    .line 1280
    .line 1281
    if-eqz v6, :cond_32

    .line 1282
    .line 1283
    invoke-virtual {v13, v11, v10}, Landroidx/fragment/app/i1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v11

    .line 1287
    goto :goto_19

    .line 1288
    :cond_32
    invoke-virtual {v13, v8, v10}, Landroidx/fragment/app/i1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v8

    .line 1292
    :goto_19
    move-object v9, v8

    .line 1293
    move-object/from16 v8, v32

    .line 1294
    .line 1295
    move-object/from16 v6, v34

    .line 1296
    .line 1297
    :goto_1a
    move-object/from16 p1, v3

    .line 1298
    .line 1299
    move-object/from16 v25, v4

    .line 1300
    .line 1301
    move-object/from16 v33, v5

    .line 1302
    .line 1303
    move-object v3, v6

    .line 1304
    move-object v4, v8

    .line 1305
    move-object v8, v9

    .line 1306
    move-object/from16 v7, v21

    .line 1307
    .line 1308
    move-object/from16 v15, v30

    .line 1309
    .line 1310
    move-object/from16 v10, v32

    .line 1311
    .line 1312
    move-object/from16 v9, v34

    .line 1313
    .line 1314
    move-object/from16 v5, v35

    .line 1315
    .line 1316
    move-object/from16 v6, p2

    .line 1317
    .line 1318
    goto/16 :goto_13

    .line 1319
    .line 1320
    :cond_33
    move-object/from16 v7, p0

    .line 1321
    .line 1322
    move-object v6, v5

    .line 1323
    move-object/from16 v34, v9

    .line 1324
    .line 1325
    move-object/from16 v32, v10

    .line 1326
    .line 1327
    move-object/from16 v30, v15

    .line 1328
    .line 1329
    move-object/from16 v5, v33

    .line 1330
    .line 1331
    invoke-virtual {v13, v11, v8, v6}, Landroidx/fragment/app/i1;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    if-nez v3, :cond_34

    .line 1336
    .line 1337
    move-object/from16 v33, v5

    .line 1338
    .line 1339
    move-object/from16 v15, v30

    .line 1340
    .line 1341
    goto/16 :goto_8

    .line 1342
    .line 1343
    :cond_34
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v4

    .line 1347
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v8

    .line 1351
    if-eqz v8, :cond_3d

    .line 1352
    .line 1353
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v8

    .line 1357
    check-cast v8, Landroidx/fragment/app/k;

    .line 1358
    .line 1359
    invoke-virtual {v8}, Lf/d0;->e()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v9

    .line 1363
    if-eqz v9, :cond_35

    .line 1364
    .line 1365
    goto :goto_1b

    .line 1366
    :cond_35
    iget-object v9, v8, Lf/d0;->a:Ljava/lang/Object;

    .line 1367
    .line 1368
    check-cast v9, Landroidx/fragment/app/m1;

    .line 1369
    .line 1370
    if-eqz v6, :cond_37

    .line 1371
    .line 1372
    move-object/from16 v10, v34

    .line 1373
    .line 1374
    move-object/from16 v11, v32

    .line 1375
    .line 1376
    if-eq v9, v10, :cond_36

    .line 1377
    .line 1378
    if-ne v9, v11, :cond_38

    .line 1379
    .line 1380
    :cond_36
    move-object/from16 p1, v4

    .line 1381
    .line 1382
    const/4 v15, 0x1

    .line 1383
    goto :goto_1c

    .line 1384
    :cond_37
    move-object/from16 v11, v32

    .line 1385
    .line 1386
    move-object/from16 v10, v34

    .line 1387
    .line 1388
    :cond_38
    move-object/from16 p1, v4

    .line 1389
    .line 1390
    const/4 v15, 0x0

    .line 1391
    :goto_1c
    iget-object v4, v8, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 1392
    .line 1393
    if-nez v4, :cond_3a

    .line 1394
    .line 1395
    if-eqz v15, :cond_39

    .line 1396
    .line 1397
    goto :goto_1e

    .line 1398
    :cond_39
    move-object/from16 v34, v10

    .line 1399
    .line 1400
    move-object/from16 v32, v11

    .line 1401
    .line 1402
    move-object/from16 v15, v30

    .line 1403
    .line 1404
    :goto_1d
    const/4 v10, 0x4

    .line 1405
    goto :goto_20

    .line 1406
    :cond_3a
    :goto_1e
    sget-object v4, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 1407
    .line 1408
    invoke-static {v12}, Lg0/k0;->c(Landroid/view/View;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v4

    .line 1412
    if-nez v4, :cond_3c

    .line 1413
    .line 1414
    const/4 v4, 0x2

    .line 1415
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v15

    .line 1419
    if-eqz v15, :cond_3b

    .line 1420
    .line 1421
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1422
    .line 1423
    const-string v15, "SpecialEffectsController: Container "

    .line 1424
    .line 1425
    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1429
    .line 1430
    .line 1431
    const-string v15, " has not been laid out. Completing operation "

    .line 1432
    .line 1433
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v4

    .line 1443
    move-object/from16 v15, v30

    .line 1444
    .line 1445
    invoke-static {v15, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1446
    .line 1447
    .line 1448
    goto :goto_1f

    .line 1449
    :cond_3b
    move-object/from16 v15, v30

    .line 1450
    .line 1451
    :goto_1f
    invoke-virtual {v8}, Lf/d0;->b()V

    .line 1452
    .line 1453
    .line 1454
    move-object/from16 v34, v10

    .line 1455
    .line 1456
    move-object/from16 v32, v11

    .line 1457
    .line 1458
    goto :goto_1d

    .line 1459
    :cond_3c
    move-object/from16 v15, v30

    .line 1460
    .line 1461
    iget-object v4, v8, Lf/d0;->a:Ljava/lang/Object;

    .line 1462
    .line 1463
    check-cast v4, Landroidx/fragment/app/m1;

    .line 1464
    .line 1465
    iget-object v4, v4, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 1466
    .line 1467
    iget-object v4, v8, Lf/d0;->b:Ljava/lang/Object;

    .line 1468
    .line 1469
    check-cast v4, Lc0/d;

    .line 1470
    .line 1471
    move-object/from16 v32, v11

    .line 1472
    .line 1473
    new-instance v11, Ld0/a;

    .line 1474
    .line 1475
    move-object/from16 v34, v10

    .line 1476
    .line 1477
    const/4 v10, 0x4

    .line 1478
    invoke-direct {v11, v7, v8, v9, v10}, Ld0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v13, v3, v4, v11}, Landroidx/fragment/app/i1;->o(Ljava/lang/Object;Lc0/d;Ld0/a;)V

    .line 1482
    .line 1483
    .line 1484
    :goto_20
    move-object/from16 v4, p1

    .line 1485
    .line 1486
    move-object/from16 v30, v15

    .line 1487
    .line 1488
    goto/16 :goto_1b

    .line 1489
    .line 1490
    :cond_3d
    move-object/from16 v15, v30

    .line 1491
    .line 1492
    const/4 v10, 0x4

    .line 1493
    sget-object v4, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 1494
    .line 1495
    invoke-static {v12}, Lg0/k0;->c(Landroid/view/View;)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v4

    .line 1499
    if-nez v4, :cond_3e

    .line 1500
    .line 1501
    move-object/from16 v33, v5

    .line 1502
    .line 1503
    goto/16 :goto_8

    .line 1504
    .line 1505
    :cond_3e
    invoke-static {v10, v1}, Landroidx/fragment/app/b1;->a(ILjava/util/ArrayList;)V

    .line 1506
    .line 1507
    .line 1508
    new-instance v4, Ljava/util/ArrayList;

    .line 1509
    .line 1510
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 1514
    .line 1515
    .line 1516
    move-result v8

    .line 1517
    const/4 v9, 0x0

    .line 1518
    :goto_21
    if-ge v9, v8, :cond_3f

    .line 1519
    .line 1520
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v10

    .line 1524
    check-cast v10, Landroid/view/View;

    .line 1525
    .line 1526
    sget-object v11, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 1527
    .line 1528
    invoke-static {v10}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v11

    .line 1532
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1533
    .line 1534
    .line 1535
    const/4 v11, 0x0

    .line 1536
    invoke-static {v10, v11}, Lg0/n0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 1537
    .line 1538
    .line 1539
    add-int/lit8 v9, v9, 0x1

    .line 1540
    .line 1541
    goto :goto_21

    .line 1542
    :cond_3f
    const/4 v9, 0x2

    .line 1543
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 1544
    .line 1545
    .line 1546
    move-result v8

    .line 1547
    if-eqz v8, :cond_41

    .line 1548
    .line 1549
    const-string v8, ">>>>> Beginning transition <<<<<"

    .line 1550
    .line 1551
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1552
    .line 1553
    .line 1554
    const-string v8, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 1555
    .line 1556
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v8

    .line 1563
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v9

    .line 1567
    const-string v10, " Name: "

    .line 1568
    .line 1569
    const-string v11, "View: "

    .line 1570
    .line 1571
    if-eqz v9, :cond_40

    .line 1572
    .line 1573
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v9

    .line 1577
    check-cast v9, Landroid/view/View;

    .line 1578
    .line 1579
    move-object/from16 p1, v8

    .line 1580
    .line 1581
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1582
    .line 1583
    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1590
    .line 1591
    .line 1592
    invoke-static {v9}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v9

    .line 1596
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v8

    .line 1603
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1604
    .line 1605
    .line 1606
    move-object/from16 v8, p1

    .line 1607
    .line 1608
    goto :goto_22

    .line 1609
    :cond_40
    const-string v8, ">>>>> SharedElementLastInViews <<<<<"

    .line 1610
    .line 1611
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v8

    .line 1618
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1619
    .line 1620
    .line 1621
    move-result v9

    .line 1622
    if-eqz v9, :cond_41

    .line 1623
    .line 1624
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v9

    .line 1628
    check-cast v9, Landroid/view/View;

    .line 1629
    .line 1630
    move-object/from16 p1, v8

    .line 1631
    .line 1632
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1633
    .line 1634
    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1641
    .line 1642
    .line 1643
    invoke-static {v9}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v9

    .line 1647
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v8

    .line 1654
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1655
    .line 1656
    .line 1657
    move-object/from16 v8, p1

    .line 1658
    .line 1659
    goto :goto_23

    .line 1660
    :cond_41
    invoke-virtual {v13, v12, v3}, Landroidx/fragment/app/i1;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 1664
    .line 1665
    .line 1666
    move-result v3

    .line 1667
    new-instance v8, Ljava/util/ArrayList;

    .line 1668
    .line 1669
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1670
    .line 1671
    .line 1672
    const/4 v9, 0x0

    .line 1673
    :goto_24
    if-ge v9, v3, :cond_45

    .line 1674
    .line 1675
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v10

    .line 1679
    check-cast v10, Landroid/view/View;

    .line 1680
    .line 1681
    sget-object v11, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 1682
    .line 1683
    invoke-static {v10}, Lg0/n0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v11

    .line 1687
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1688
    .line 1689
    .line 1690
    if-nez v11, :cond_43

    .line 1691
    .line 1692
    :cond_42
    move-object/from16 v33, v5

    .line 1693
    .line 1694
    goto :goto_26

    .line 1695
    :cond_43
    const/4 v7, 0x0

    .line 1696
    invoke-static {v10, v7}, Lg0/n0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 1697
    .line 1698
    .line 1699
    move-object/from16 v10, v23

    .line 1700
    .line 1701
    invoke-virtual {v10, v11, v7}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v16

    .line 1705
    move-object/from16 v7, v16

    .line 1706
    .line 1707
    check-cast v7, Ljava/lang/String;

    .line 1708
    .line 1709
    move-object/from16 v23, v10

    .line 1710
    .line 1711
    const/4 v10, 0x0

    .line 1712
    :goto_25
    if-ge v10, v3, :cond_42

    .line 1713
    .line 1714
    move-object/from16 v33, v5

    .line 1715
    .line 1716
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v5

    .line 1720
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v5

    .line 1724
    if-eqz v5, :cond_44

    .line 1725
    .line 1726
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v5

    .line 1730
    check-cast v5, Landroid/view/View;

    .line 1731
    .line 1732
    invoke-static {v5, v11}, Lg0/n0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_26

    .line 1736
    :cond_44
    add-int/lit8 v10, v10, 0x1

    .line 1737
    .line 1738
    move-object/from16 v5, v33

    .line 1739
    .line 1740
    goto :goto_25

    .line 1741
    :goto_26
    add-int/lit8 v9, v9, 0x1

    .line 1742
    .line 1743
    move-object/from16 v7, p0

    .line 1744
    .line 1745
    move-object/from16 v5, v33

    .line 1746
    .line 1747
    goto :goto_24

    .line 1748
    :cond_45
    move-object/from16 v33, v5

    .line 1749
    .line 1750
    new-instance v5, Landroidx/fragment/app/h1;

    .line 1751
    .line 1752
    move-object/from16 v23, v5

    .line 1753
    .line 1754
    move/from16 v24, v3

    .line 1755
    .line 1756
    move-object/from16 v25, v14

    .line 1757
    .line 1758
    move-object/from16 v26, v4

    .line 1759
    .line 1760
    move-object/from16 v27, v0

    .line 1761
    .line 1762
    move-object/from16 v28, v8

    .line 1763
    .line 1764
    invoke-direct/range {v23 .. v28}, Landroidx/fragment/app/h1;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1765
    .line 1766
    .line 1767
    invoke-static {v12, v5}, Lg0/b0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1768
    .line 1769
    .line 1770
    const/4 v3, 0x0

    .line 1771
    invoke-static {v3, v1}, Landroidx/fragment/app/b1;->a(ILjava/util/ArrayList;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v13, v6, v0, v14}, Landroidx/fragment/app/i1;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1775
    .line 1776
    .line 1777
    :goto_27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1778
    .line 1779
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    .line 1780
    .line 1781
    .line 1782
    move-result v6

    .line 1783
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v7

    .line 1787
    new-instance v0, Ljava/util/ArrayList;

    .line 1788
    .line 1789
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    move v8, v3

    .line 1797
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1798
    .line 1799
    .line 1800
    move-result v4

    .line 1801
    const-string v9, " has started."

    .line 1802
    .line 1803
    if-eqz v4, :cond_4e

    .line 1804
    .line 1805
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v4

    .line 1809
    check-cast v4, Landroidx/fragment/app/j;

    .line 1810
    .line 1811
    invoke-virtual {v4}, Lf/d0;->e()Z

    .line 1812
    .line 1813
    .line 1814
    move-result v5

    .line 1815
    if-eqz v5, :cond_46

    .line 1816
    .line 1817
    invoke-virtual {v4}, Lf/d0;->b()V

    .line 1818
    .line 1819
    .line 1820
    goto :goto_28

    .line 1821
    :cond_46
    invoke-virtual {v4, v7}, Landroidx/fragment/app/j;->h(Landroid/content/Context;)Landroidx/fragment/app/c0;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v5

    .line 1825
    if-nez v5, :cond_47

    .line 1826
    .line 1827
    invoke-virtual {v4}, Lf/d0;->b()V

    .line 1828
    .line 1829
    .line 1830
    goto :goto_28

    .line 1831
    :cond_47
    iget-object v5, v5, Landroidx/fragment/app/c0;->b:Landroid/animation/Animator;

    .line 1832
    .line 1833
    if-nez v5, :cond_48

    .line 1834
    .line 1835
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1836
    .line 1837
    .line 1838
    goto :goto_28

    .line 1839
    :cond_48
    iget-object v10, v4, Lf/d0;->a:Ljava/lang/Object;

    .line 1840
    .line 1841
    check-cast v10, Landroidx/fragment/app/m1;

    .line 1842
    .line 1843
    iget-object v11, v10, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 1844
    .line 1845
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1846
    .line 1847
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v14

    .line 1851
    invoke-virtual {v13, v14}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1852
    .line 1853
    .line 1854
    move-result v13

    .line 1855
    if-eqz v13, :cond_4a

    .line 1856
    .line 1857
    const/4 v13, 0x2

    .line 1858
    invoke-static {v13}, Landroidx/fragment/app/s0;->H(I)Z

    .line 1859
    .line 1860
    .line 1861
    move-result v5

    .line 1862
    if-eqz v5, :cond_49

    .line 1863
    .line 1864
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1865
    .line 1866
    const-string v9, "Ignoring Animator set on "

    .line 1867
    .line 1868
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1872
    .line 1873
    .line 1874
    const-string v9, " as this Fragment was involved in a Transition."

    .line 1875
    .line 1876
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1877
    .line 1878
    .line 1879
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v5

    .line 1883
    invoke-static {v15, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1884
    .line 1885
    .line 1886
    :cond_49
    invoke-virtual {v4}, Lf/d0;->b()V

    .line 1887
    .line 1888
    .line 1889
    goto :goto_28

    .line 1890
    :cond_4a
    iget v8, v10, Landroidx/fragment/app/m1;->a:I

    .line 1891
    .line 1892
    const/4 v13, 0x3

    .line 1893
    if-ne v8, v13, :cond_4b

    .line 1894
    .line 1895
    const/16 v26, 0x1

    .line 1896
    .line 1897
    goto :goto_29

    .line 1898
    :cond_4b
    move/from16 v26, v3

    .line 1899
    .line 1900
    :goto_29
    if-eqz v26, :cond_4c

    .line 1901
    .line 1902
    move-object/from16 v14, v33

    .line 1903
    .line 1904
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1905
    .line 1906
    .line 1907
    goto :goto_2a

    .line 1908
    :cond_4c
    move-object/from16 v14, v33

    .line 1909
    .line 1910
    :goto_2a
    iget-object v8, v11, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 1911
    .line 1912
    invoke-virtual {v12, v8}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 1913
    .line 1914
    .line 1915
    new-instance v11, Landroidx/fragment/app/d;

    .line 1916
    .line 1917
    move-object/from16 v23, v11

    .line 1918
    .line 1919
    move-object/from16 v24, v12

    .line 1920
    .line 1921
    move-object/from16 v25, v8

    .line 1922
    .line 1923
    move-object/from16 v27, v10

    .line 1924
    .line 1925
    move-object/from16 v28, v4

    .line 1926
    .line 1927
    invoke-direct/range {v23 .. v28}, Landroidx/fragment/app/d;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/m1;Landroidx/fragment/app/j;)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v5, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v5, v8}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual {v5}, Landroid/animation/Animator;->start()V

    .line 1937
    .line 1938
    .line 1939
    const/4 v8, 0x2

    .line 1940
    invoke-static {v8}, Landroidx/fragment/app/s0;->H(I)Z

    .line 1941
    .line 1942
    .line 1943
    move-result v11

    .line 1944
    if-eqz v11, :cond_4d

    .line 1945
    .line 1946
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1947
    .line 1948
    const-string v11, "Animator from operation "

    .line 1949
    .line 1950
    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1951
    .line 1952
    .line 1953
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1954
    .line 1955
    .line 1956
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1957
    .line 1958
    .line 1959
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v8

    .line 1963
    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1964
    .line 1965
    .line 1966
    :cond_4d
    iget-object v4, v4, Lf/d0;->b:Ljava/lang/Object;

    .line 1967
    .line 1968
    check-cast v4, Lc0/d;

    .line 1969
    .line 1970
    new-instance v8, Lf/c;

    .line 1971
    .line 1972
    const/4 v9, 0x4

    .line 1973
    move-object/from16 v11, p0

    .line 1974
    .line 1975
    invoke-direct {v8, v11, v5, v10, v9}, Lf/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1976
    .line 1977
    .line 1978
    invoke-virtual {v4, v8}, Lc0/d;->a(Lc0/c;)V

    .line 1979
    .line 1980
    .line 1981
    move-object/from16 v33, v14

    .line 1982
    .line 1983
    const/4 v8, 0x1

    .line 1984
    goto/16 :goto_28

    .line 1985
    .line 1986
    :cond_4e
    move-object/from16 v11, p0

    .line 1987
    .line 1988
    move-object/from16 v14, v33

    .line 1989
    .line 1990
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v10

    .line 1994
    :goto_2b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1995
    .line 1996
    .line 1997
    move-result v0

    .line 1998
    if-eqz v0, :cond_55

    .line 1999
    .line 2000
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v0

    .line 2004
    move-object v3, v0

    .line 2005
    check-cast v3, Landroidx/fragment/app/j;

    .line 2006
    .line 2007
    iget-object v0, v3, Lf/d0;->a:Ljava/lang/Object;

    .line 2008
    .line 2009
    move-object v5, v0

    .line 2010
    check-cast v5, Landroidx/fragment/app/m1;

    .line 2011
    .line 2012
    iget-object v0, v5, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 2013
    .line 2014
    const-string v1, "Ignoring Animation set on "

    .line 2015
    .line 2016
    if-eqz v6, :cond_50

    .line 2017
    .line 2018
    const/4 v2, 0x2

    .line 2019
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 2020
    .line 2021
    .line 2022
    move-result v4

    .line 2023
    if-eqz v4, :cond_4f

    .line 2024
    .line 2025
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2026
    .line 2027
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2031
    .line 2032
    .line 2033
    const-string v0, " as Animations cannot run alongside Transitions."

    .line 2034
    .line 2035
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v0

    .line 2042
    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2043
    .line 2044
    .line 2045
    :cond_4f
    invoke-virtual {v3}, Lf/d0;->b()V

    .line 2046
    .line 2047
    .line 2048
    goto :goto_2b

    .line 2049
    :cond_50
    if-eqz v8, :cond_52

    .line 2050
    .line 2051
    const/4 v2, 0x2

    .line 2052
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v4

    .line 2056
    if-eqz v4, :cond_51

    .line 2057
    .line 2058
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2059
    .line 2060
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2061
    .line 2062
    .line 2063
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2064
    .line 2065
    .line 2066
    const-string v0, " as Animations cannot run alongside Animators."

    .line 2067
    .line 2068
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2069
    .line 2070
    .line 2071
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v0

    .line 2075
    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2076
    .line 2077
    .line 2078
    :cond_51
    invoke-virtual {v3}, Lf/d0;->b()V

    .line 2079
    .line 2080
    .line 2081
    goto :goto_2b

    .line 2082
    :cond_52
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 2083
    .line 2084
    invoke-virtual {v3, v7}, Landroidx/fragment/app/j;->h(Landroid/content/Context;)Landroidx/fragment/app/c0;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2089
    .line 2090
    .line 2091
    iget-object v0, v0, Landroidx/fragment/app/c0;->a:Landroid/view/animation/Animation;

    .line 2092
    .line 2093
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2094
    .line 2095
    .line 2096
    iget v2, v5, Landroidx/fragment/app/m1;->a:I

    .line 2097
    .line 2098
    const/4 v13, 0x1

    .line 2099
    if-eq v2, v13, :cond_53

    .line 2100
    .line 2101
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2102
    .line 2103
    .line 2104
    invoke-virtual {v3}, Lf/d0;->b()V

    .line 2105
    .line 2106
    .line 2107
    goto :goto_2c

    .line 2108
    :cond_53
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 2109
    .line 2110
    .line 2111
    new-instance v2, Landroidx/fragment/app/d0;

    .line 2112
    .line 2113
    invoke-direct {v2, v0, v12, v1}, Landroidx/fragment/app/d0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 2114
    .line 2115
    .line 2116
    new-instance v0, Landroidx/fragment/app/f;

    .line 2117
    .line 2118
    invoke-direct {v0, v1, v12, v3, v5}, Landroidx/fragment/app/f;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/j;Landroidx/fragment/app/m1;)V

    .line 2119
    .line 2120
    .line 2121
    invoke-virtual {v2, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 2122
    .line 2123
    .line 2124
    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2125
    .line 2126
    .line 2127
    const/4 v0, 0x2

    .line 2128
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 2129
    .line 2130
    .line 2131
    move-result v2

    .line 2132
    if-eqz v2, :cond_54

    .line 2133
    .line 2134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2135
    .line 2136
    const-string v2, "Animation from operation "

    .line 2137
    .line 2138
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2139
    .line 2140
    .line 2141
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2145
    .line 2146
    .line 2147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v0

    .line 2151
    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2152
    .line 2153
    .line 2154
    :cond_54
    :goto_2c
    iget-object v0, v3, Lf/d0;->b:Ljava/lang/Object;

    .line 2155
    .line 2156
    move-object v4, v0

    .line 2157
    check-cast v4, Lc0/d;

    .line 2158
    .line 2159
    new-instance v2, Landroidx/fragment/app/g;

    .line 2160
    .line 2161
    move-object v0, v2

    .line 2162
    move-object v13, v2

    .line 2163
    move-object v2, v12

    .line 2164
    move/from16 p1, v6

    .line 2165
    .line 2166
    move-object v6, v4

    .line 2167
    move-object/from16 v4, p0

    .line 2168
    .line 2169
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/g;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/j;Landroidx/fragment/app/l;Landroidx/fragment/app/m1;)V

    .line 2170
    .line 2171
    .line 2172
    invoke-virtual {v6, v13}, Lc0/d;->a(Lc0/c;)V

    .line 2173
    .line 2174
    .line 2175
    move/from16 v6, p1

    .line 2176
    .line 2177
    goto/16 :goto_2b

    .line 2178
    .line 2179
    :cond_55
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2184
    .line 2185
    .line 2186
    move-result v1

    .line 2187
    if-eqz v1, :cond_56

    .line 2188
    .line 2189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v1

    .line 2193
    check-cast v1, Landroidx/fragment/app/m1;

    .line 2194
    .line 2195
    iget-object v2, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 2196
    .line 2197
    iget-object v2, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 2198
    .line 2199
    iget v1, v1, Landroidx/fragment/app/m1;->a:I

    .line 2200
    .line 2201
    invoke-static {v1, v2}, La3/g;->b(ILandroid/view/View;)V

    .line 2202
    .line 2203
    .line 2204
    goto :goto_2d

    .line 2205
    :cond_56
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 2206
    .line 2207
    .line 2208
    const/4 v0, 0x2

    .line 2209
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v0

    .line 2213
    if-eqz v0, :cond_57

    .line 2214
    .line 2215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2216
    .line 2217
    const-string v1, "Completed executing operations from "

    .line 2218
    .line 2219
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2220
    .line 2221
    .line 2222
    move-object/from16 v9, v34

    .line 2223
    .line 2224
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2225
    .line 2226
    .line 2227
    move-object/from16 v1, v29

    .line 2228
    .line 2229
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2230
    .line 2231
    .line 2232
    move-object/from16 v10, v32

    .line 2233
    .line 2234
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2235
    .line 2236
    .line 2237
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v0

    .line 2241
    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2242
    .line 2243
    .line 2244
    :cond_57
    return-void
.end method
