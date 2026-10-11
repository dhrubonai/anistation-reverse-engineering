.class public Landroidx/constraintlayout/helper/widget/Flow;
.super Ls/r;
.source "SourceFile"


# instance fields
.field public z:Lq/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls/r;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e(Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Ls/r;->e(Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lq/h;

    .line 5
    .line 6
    invoke-direct {v0}, Lq/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 10
    .line 11
    if-eqz p1, :cond_1a

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ls/q;->b:[I

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    move v2, v1

    .line 29
    :goto_0
    if-ge v2, v0, :cond_1a

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 38
    .line 39
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iput v3, v4, Lq/h;->I0:I

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_0
    const/4 v4, 0x1

    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 51
    .line 52
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, v4, Lq/h;->f0:I

    .line 57
    .line 58
    iput v3, v4, Lq/h;->g0:I

    .line 59
    .line 60
    iput v3, v4, Lq/h;->h0:I

    .line 61
    .line 62
    iput v3, v4, Lq/h;->i0:I

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :cond_1
    const/16 v4, 0xb

    .line 67
    .line 68
    if-ne v3, v4, :cond_2

    .line 69
    .line 70
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 71
    .line 72
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput v3, v4, Lq/h;->h0:I

    .line 77
    .line 78
    iput v3, v4, Lq/h;->j0:I

    .line 79
    .line 80
    iput v3, v4, Lq/h;->k0:I

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_2
    const/16 v4, 0xc

    .line 85
    .line 86
    if-ne v3, v4, :cond_3

    .line 87
    .line 88
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 89
    .line 90
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iput v3, v4, Lq/h;->i0:I

    .line 95
    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :cond_3
    const/4 v4, 0x2

    .line 99
    if-ne v3, v4, :cond_4

    .line 100
    .line 101
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 102
    .line 103
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iput v3, v4, Lq/h;->j0:I

    .line 108
    .line 109
    goto/16 :goto_1

    .line 110
    .line 111
    :cond_4
    const/4 v5, 0x3

    .line 112
    if-ne v3, v5, :cond_5

    .line 113
    .line 114
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 115
    .line 116
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    iput v3, v4, Lq/h;->f0:I

    .line 121
    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_5
    const/4 v5, 0x4

    .line 125
    if-ne v3, v5, :cond_6

    .line 126
    .line 127
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 128
    .line 129
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    iput v3, v4, Lq/h;->k0:I

    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :cond_6
    const/4 v5, 0x5

    .line 138
    if-ne v3, v5, :cond_7

    .line 139
    .line 140
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 141
    .line 142
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    iput v3, v4, Lq/h;->g0:I

    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :cond_7
    const/16 v5, 0x25

    .line 151
    .line 152
    if-ne v3, v5, :cond_8

    .line 153
    .line 154
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 155
    .line 156
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    iput v3, v4, Lq/h;->G0:I

    .line 161
    .line 162
    goto/16 :goto_1

    .line 163
    .line 164
    :cond_8
    const/16 v5, 0x1b

    .line 165
    .line 166
    if-ne v3, v5, :cond_9

    .line 167
    .line 168
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 169
    .line 170
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    iput v3, v4, Lq/h;->q0:I

    .line 175
    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :cond_9
    const/16 v5, 0x24

    .line 179
    .line 180
    if-ne v3, v5, :cond_a

    .line 181
    .line 182
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 183
    .line 184
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iput v3, v4, Lq/h;->r0:I

    .line 189
    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :cond_a
    const/16 v5, 0x15

    .line 193
    .line 194
    if-ne v3, v5, :cond_b

    .line 195
    .line 196
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 197
    .line 198
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    iput v3, v4, Lq/h;->s0:I

    .line 203
    .line 204
    goto/16 :goto_1

    .line 205
    .line 206
    :cond_b
    const/16 v5, 0x1d

    .line 207
    .line 208
    if-ne v3, v5, :cond_c

    .line 209
    .line 210
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 211
    .line 212
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    iput v3, v4, Lq/h;->u0:I

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :cond_c
    const/16 v5, 0x17

    .line 221
    .line 222
    if-ne v3, v5, :cond_d

    .line 223
    .line 224
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 225
    .line 226
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    iput v3, v4, Lq/h;->t0:I

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_d
    const/16 v5, 0x1f

    .line 235
    .line 236
    if-ne v3, v5, :cond_e

    .line 237
    .line 238
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 239
    .line 240
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    iput v3, v4, Lq/h;->v0:I

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_e
    const/16 v5, 0x19

    .line 249
    .line 250
    const/high16 v6, 0x3f000000    # 0.5f

    .line 251
    .line 252
    if-ne v3, v5, :cond_f

    .line 253
    .line 254
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 255
    .line 256
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    iput v3, v4, Lq/h;->w0:F

    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_f
    const/16 v5, 0x14

    .line 265
    .line 266
    if-ne v3, v5, :cond_10

    .line 267
    .line 268
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 269
    .line 270
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    iput v3, v4, Lq/h;->y0:F

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_10
    const/16 v5, 0x1c

    .line 279
    .line 280
    if-ne v3, v5, :cond_11

    .line 281
    .line 282
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 283
    .line 284
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    iput v3, v4, Lq/h;->A0:F

    .line 289
    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :cond_11
    const/16 v5, 0x16

    .line 293
    .line 294
    if-ne v3, v5, :cond_12

    .line 295
    .line 296
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 297
    .line 298
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    iput v3, v4, Lq/h;->z0:F

    .line 303
    .line 304
    goto :goto_1

    .line 305
    :cond_12
    const/16 v5, 0x1e

    .line 306
    .line 307
    if-ne v3, v5, :cond_13

    .line 308
    .line 309
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 310
    .line 311
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    iput v3, v4, Lq/h;->B0:F

    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_13
    const/16 v5, 0x22

    .line 319
    .line 320
    if-ne v3, v5, :cond_14

    .line 321
    .line 322
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 323
    .line 324
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    iput v3, v4, Lq/h;->x0:F

    .line 329
    .line 330
    goto :goto_1

    .line 331
    :cond_14
    const/16 v5, 0x18

    .line 332
    .line 333
    if-ne v3, v5, :cond_15

    .line 334
    .line 335
    iget-object v5, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 336
    .line 337
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    iput v3, v5, Lq/h;->E0:I

    .line 342
    .line 343
    goto :goto_1

    .line 344
    :cond_15
    const/16 v5, 0x21

    .line 345
    .line 346
    if-ne v3, v5, :cond_16

    .line 347
    .line 348
    iget-object v5, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 349
    .line 350
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    iput v3, v5, Lq/h;->F0:I

    .line 355
    .line 356
    goto :goto_1

    .line 357
    :cond_16
    const/16 v4, 0x1a

    .line 358
    .line 359
    if-ne v3, v4, :cond_17

    .line 360
    .line 361
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 362
    .line 363
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    iput v3, v4, Lq/h;->C0:I

    .line 368
    .line 369
    goto :goto_1

    .line 370
    :cond_17
    const/16 v4, 0x23

    .line 371
    .line 372
    if-ne v3, v4, :cond_18

    .line 373
    .line 374
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 375
    .line 376
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    iput v3, v4, Lq/h;->D0:I

    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_18
    const/16 v4, 0x20

    .line 384
    .line 385
    if-ne v3, v4, :cond_19

    .line 386
    .line 387
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 388
    .line 389
    const/4 v5, -0x1

    .line 390
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    iput v3, v4, Lq/h;->H0:I

    .line 395
    .line 396
    :cond_19
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_1a
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 401
    .line 402
    iput-object p1, p0, Ls/b;->d:Lq/k;

    .line 403
    .line 404
    invoke-virtual {p0}, Ls/b;->g()V

    .line 405
    .line 406
    .line 407
    return-void
.end method

.method public final f(Lq/e;Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iget v0, p1, Lq/h;->h0:I

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    iget v1, p1, Lq/h;->i0:I

    .line 8
    .line 9
    if-lez v1, :cond_2

    .line 10
    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget p2, p1, Lq/h;->i0:I

    .line 14
    .line 15
    iput p2, p1, Lq/h;->j0:I

    .line 16
    .line 17
    iput v0, p1, Lq/h;->k0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput v0, p1, Lq/h;->j0:I

    .line 21
    .line 22
    iget p2, p1, Lq/h;->i0:I

    .line 23
    .line 24
    iput p2, p1, Lq/h;->k0:I

    .line 25
    .line 26
    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Lq/h;II)V
    .locals 39

    .line 1
    move-object/from16 v8, p1

    .line 2
    .line 3
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 4
    .line 5
    .line 6
    move-result v9

    .line 7
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    .line 9
    .line 10
    move-result v10

    .line 11
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result v11

    .line 15
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    const/4 v13, 0x0

    .line 20
    if-eqz v8, :cond_61

    .line 21
    .line 22
    iget v0, v8, Lq/k;->e0:I

    .line 23
    .line 24
    const/4 v14, 0x2

    .line 25
    const/4 v15, 0x1

    .line 26
    const/4 v7, 0x3

    .line 27
    if-lez v0, :cond_a

    .line 28
    .line 29
    iget-object v0, v8, Lq/e;->I:Lq/e;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    check-cast v0, Lq/f;

    .line 34
    .line 35
    iget-object v0, v0, Lq/f;->g0:Ls/e;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    :goto_0
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v13

    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    move v2, v13

    .line 45
    :goto_1
    iget v3, v8, Lq/k;->e0:I

    .line 46
    .line 47
    if-ge v2, v3, :cond_9

    .line 48
    .line 49
    iget-object v3, v8, Lq/k;->d0:[Lq/e;

    .line 50
    .line 51
    aget-object v3, v3, v2

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_2
    instance-of v4, v3, Lq/i;

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    invoke-virtual {v3, v13}, Lq/e;->i(I)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v3, v15}, Lq/e;->i(I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-ne v4, v7, :cond_4

    .line 70
    .line 71
    iget v6, v3, Lq/e;->j:I

    .line 72
    .line 73
    if-eq v6, v15, :cond_4

    .line 74
    .line 75
    if-ne v5, v7, :cond_4

    .line 76
    .line 77
    iget v6, v3, Lq/e;->k:I

    .line 78
    .line 79
    if-eq v6, v15, :cond_4

    .line 80
    .line 81
    move v6, v15

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move v6, v13

    .line 84
    :goto_2
    if-eqz v6, :cond_5

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    if-ne v4, v7, :cond_6

    .line 88
    .line 89
    move v4, v14

    .line 90
    :cond_6
    if-ne v5, v7, :cond_7

    .line 91
    .line 92
    move v5, v14

    .line 93
    :cond_7
    iget-object v6, v8, Lq/h;->o0:Lr/b;

    .line 94
    .line 95
    iput v4, v6, Lr/b;->a:I

    .line 96
    .line 97
    iput v5, v6, Lr/b;->b:I

    .line 98
    .line 99
    invoke-virtual {v3}, Lq/e;->m()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    iput v4, v6, Lr/b;->c:I

    .line 104
    .line 105
    invoke-virtual {v3}, Lq/e;->j()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    iput v4, v6, Lr/b;->d:I

    .line 110
    .line 111
    invoke-virtual {v0, v3, v6}, Ls/e;->a(Lq/e;Lr/b;)V

    .line 112
    .line 113
    .line 114
    iget v4, v6, Lr/b;->e:I

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Lq/e;->z(I)V

    .line 117
    .line 118
    .line 119
    iget v4, v6, Lr/b;->f:I

    .line 120
    .line 121
    invoke-virtual {v3, v4}, Lq/e;->w(I)V

    .line 122
    .line 123
    .line 124
    iget v4, v6, Lr/b;->g:I

    .line 125
    .line 126
    iput v4, v3, Lq/e;->P:I

    .line 127
    .line 128
    if-lez v4, :cond_8

    .line 129
    .line 130
    move v4, v15

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    move v4, v13

    .line 133
    :goto_3
    iput-boolean v4, v3, Lq/e;->w:Z

    .line 134
    .line 135
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_9
    move v0, v15

    .line 139
    :goto_5
    if-nez v0, :cond_a

    .line 140
    .line 141
    iput v13, v8, Lq/h;->m0:I

    .line 142
    .line 143
    iput v13, v8, Lq/h;->n0:I

    .line 144
    .line 145
    iput-boolean v13, v8, Lq/h;->l0:Z

    .line 146
    .line 147
    move-object/from16 v1, p0

    .line 148
    .line 149
    move-object v0, v8

    .line 150
    goto/16 :goto_38

    .line 151
    .line 152
    :cond_a
    iget v6, v8, Lq/h;->j0:I

    .line 153
    .line 154
    iget v5, v8, Lq/h;->k0:I

    .line 155
    .line 156
    iget v4, v8, Lq/h;->f0:I

    .line 157
    .line 158
    iget v3, v8, Lq/h;->g0:I

    .line 159
    .line 160
    new-array v2, v14, [I

    .line 161
    .line 162
    sub-int v0, v10, v6

    .line 163
    .line 164
    sub-int/2addr v0, v5

    .line 165
    iget v7, v8, Lq/h;->I0:I

    .line 166
    .line 167
    if-ne v7, v15, :cond_b

    .line 168
    .line 169
    sub-int v0, v12, v4

    .line 170
    .line 171
    sub-int/2addr v0, v3

    .line 172
    :cond_b
    const/4 v1, -0x1

    .line 173
    if-nez v7, :cond_d

    .line 174
    .line 175
    iget v7, v8, Lq/h;->q0:I

    .line 176
    .line 177
    if-ne v7, v1, :cond_c

    .line 178
    .line 179
    iput v13, v8, Lq/h;->q0:I

    .line 180
    .line 181
    :cond_c
    iget v7, v8, Lq/h;->r0:I

    .line 182
    .line 183
    if-ne v7, v1, :cond_f

    .line 184
    .line 185
    iput v13, v8, Lq/h;->r0:I

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_d
    iget v7, v8, Lq/h;->q0:I

    .line 189
    .line 190
    if-ne v7, v1, :cond_e

    .line 191
    .line 192
    iput v13, v8, Lq/h;->q0:I

    .line 193
    .line 194
    :cond_e
    iget v7, v8, Lq/h;->r0:I

    .line 195
    .line 196
    if-ne v7, v1, :cond_f

    .line 197
    .line 198
    iput v13, v8, Lq/h;->r0:I

    .line 199
    .line 200
    :cond_f
    :goto_6
    iget-object v1, v8, Lq/k;->d0:[Lq/e;

    .line 201
    .line 202
    move v7, v13

    .line 203
    move/from16 v16, v7

    .line 204
    .line 205
    :goto_7
    iget v13, v8, Lq/k;->e0:I

    .line 206
    .line 207
    const/16 v14, 0x8

    .line 208
    .line 209
    if-ge v7, v13, :cond_11

    .line 210
    .line 211
    iget-object v13, v8, Lq/k;->d0:[Lq/e;

    .line 212
    .line 213
    aget-object v13, v13, v7

    .line 214
    .line 215
    iget v13, v13, Lq/e;->V:I

    .line 216
    .line 217
    if-ne v13, v14, :cond_10

    .line 218
    .line 219
    add-int/lit8 v16, v16, 0x1

    .line 220
    .line 221
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 222
    .line 223
    const/4 v14, 0x2

    .line 224
    goto :goto_7

    .line 225
    :cond_11
    if-lez v16, :cond_13

    .line 226
    .line 227
    sub-int v13, v13, v16

    .line 228
    .line 229
    new-array v1, v13, [Lq/e;

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const/4 v13, 0x0

    .line 233
    :goto_8
    iget v15, v8, Lq/k;->e0:I

    .line 234
    .line 235
    if-ge v7, v15, :cond_13

    .line 236
    .line 237
    iget-object v15, v8, Lq/k;->d0:[Lq/e;

    .line 238
    .line 239
    aget-object v15, v15, v7

    .line 240
    .line 241
    move-object/from16 v16, v2

    .line 242
    .line 243
    iget v2, v15, Lq/e;->V:I

    .line 244
    .line 245
    if-eq v2, v14, :cond_12

    .line 246
    .line 247
    aput-object v15, v1, v13

    .line 248
    .line 249
    add-int/lit8 v13, v13, 0x1

    .line 250
    .line 251
    :cond_12
    add-int/lit8 v7, v7, 0x1

    .line 252
    .line 253
    move-object/from16 v2, v16

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_13
    move-object/from16 v16, v2

    .line 257
    .line 258
    move v14, v13

    .line 259
    move-object v13, v1

    .line 260
    iput-object v13, v8, Lq/h;->N0:[Lq/e;

    .line 261
    .line 262
    iput v14, v8, Lq/h;->O0:I

    .line 263
    .line 264
    iget v1, v8, Lq/h;->G0:I

    .line 265
    .line 266
    iget-object v15, v8, Lq/h;->J0:Ljava/util/ArrayList;

    .line 267
    .line 268
    if-eqz v1, :cond_56

    .line 269
    .line 270
    const/4 v2, 0x1

    .line 271
    if-eq v1, v2, :cond_3b

    .line 272
    .line 273
    const/4 v2, 0x2

    .line 274
    if-eq v1, v2, :cond_14

    .line 275
    .line 276
    move-object/from16 v19, p0

    .line 277
    .line 278
    move-object v0, v8

    .line 279
    move-object/from16 v28, v16

    .line 280
    .line 281
    goto/16 :goto_31

    .line 282
    .line 283
    :cond_14
    iget v1, v8, Lq/h;->I0:I

    .line 284
    .line 285
    if-nez v1, :cond_1a

    .line 286
    .line 287
    iget v2, v8, Lq/h;->H0:I

    .line 288
    .line 289
    if-gtz v2, :cond_19

    .line 290
    .line 291
    const/4 v2, 0x0

    .line 292
    const/4 v7, 0x0

    .line 293
    const/4 v15, 0x0

    .line 294
    :goto_9
    if-ge v2, v14, :cond_18

    .line 295
    .line 296
    move/from16 v18, v3

    .line 297
    .line 298
    if-lez v2, :cond_15

    .line 299
    .line 300
    iget v3, v8, Lq/h;->C0:I

    .line 301
    .line 302
    add-int/2addr v7, v3

    .line 303
    :cond_15
    aget-object v3, v13, v2

    .line 304
    .line 305
    if-nez v3, :cond_16

    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_16
    invoke-virtual {v8, v3, v0}, Lq/h;->D(Lq/e;I)I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    add-int/2addr v3, v7

    .line 313
    if-le v3, v0, :cond_17

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_17
    add-int/lit8 v15, v15, 0x1

    .line 317
    .line 318
    move v7, v3

    .line 319
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 320
    .line 321
    move/from16 v3, v18

    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_18
    move/from16 v18, v3

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_19
    move/from16 v18, v3

    .line 328
    .line 329
    move v15, v2

    .line 330
    :goto_b
    const/4 v2, 0x0

    .line 331
    goto :goto_f

    .line 332
    :cond_1a
    move/from16 v18, v3

    .line 333
    .line 334
    iget v2, v8, Lq/h;->H0:I

    .line 335
    .line 336
    if-gtz v2, :cond_1f

    .line 337
    .line 338
    const/4 v2, 0x0

    .line 339
    const/4 v3, 0x0

    .line 340
    const/4 v7, 0x0

    .line 341
    :goto_c
    if-ge v2, v14, :cond_1e

    .line 342
    .line 343
    if-lez v2, :cond_1b

    .line 344
    .line 345
    iget v15, v8, Lq/h;->D0:I

    .line 346
    .line 347
    add-int/2addr v3, v15

    .line 348
    :cond_1b
    aget-object v15, v13, v2

    .line 349
    .line 350
    if-nez v15, :cond_1c

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_1c
    invoke-virtual {v8, v15, v0}, Lq/h;->C(Lq/e;I)I

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    add-int/2addr v15, v3

    .line 358
    if-le v15, v0, :cond_1d

    .line 359
    .line 360
    goto :goto_e

    .line 361
    :cond_1d
    add-int/lit8 v7, v7, 0x1

    .line 362
    .line 363
    move v3, v15

    .line 364
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_1e
    :goto_e
    move v2, v7

    .line 368
    :cond_1f
    const/4 v15, 0x0

    .line 369
    :goto_f
    iget-object v3, v8, Lq/h;->M0:[I

    .line 370
    .line 371
    if-nez v3, :cond_20

    .line 372
    .line 373
    const/4 v3, 0x2

    .line 374
    new-array v3, v3, [I

    .line 375
    .line 376
    iput-object v3, v8, Lq/h;->M0:[I

    .line 377
    .line 378
    :cond_20
    if-nez v2, :cond_21

    .line 379
    .line 380
    const/4 v3, 0x1

    .line 381
    if-eq v1, v3, :cond_22

    .line 382
    .line 383
    :cond_21
    if-nez v15, :cond_23

    .line 384
    .line 385
    if-nez v1, :cond_23

    .line 386
    .line 387
    :cond_22
    move-object/from16 v19, p0

    .line 388
    .line 389
    move v3, v0

    .line 390
    move v7, v5

    .line 391
    move/from16 v21, v6

    .line 392
    .line 393
    move v0, v15

    .line 394
    move-object/from16 v17, v16

    .line 395
    .line 396
    move v5, v2

    .line 397
    move v6, v4

    .line 398
    move-object v2, v8

    .line 399
    move v15, v14

    .line 400
    move v4, v1

    .line 401
    move-object v14, v13

    .line 402
    const/4 v1, 0x1

    .line 403
    move v13, v12

    .line 404
    move v12, v11

    .line 405
    move v11, v10

    .line 406
    move v10, v9

    .line 407
    move-object v9, v2

    .line 408
    goto/16 :goto_1d

    .line 409
    .line 410
    :cond_23
    move-object/from16 v19, p0

    .line 411
    .line 412
    move v3, v1

    .line 413
    move v7, v5

    .line 414
    move-object/from16 p1, v8

    .line 415
    .line 416
    move-object/from16 v1, p1

    .line 417
    .line 418
    move-object/from16 v5, v16

    .line 419
    .line 420
    const/16 v17, 0x0

    .line 421
    .line 422
    move/from16 v38, v2

    .line 423
    .line 424
    move v2, v0

    .line 425
    move v0, v15

    .line 426
    move v15, v14

    .line 427
    move-object v14, v13

    .line 428
    move v13, v12

    .line 429
    move v12, v11

    .line 430
    move v11, v10

    .line 431
    move v10, v9

    .line 432
    move v9, v6

    .line 433
    move v6, v4

    .line 434
    move/from16 v4, v38

    .line 435
    .line 436
    :goto_10
    if-nez v17, :cond_3a

    .line 437
    .line 438
    if-nez v3, :cond_24

    .line 439
    .line 440
    int-to-float v4, v15

    .line 441
    move-object/from16 p2, v1

    .line 442
    .line 443
    int-to-float v1, v0

    .line 444
    div-float/2addr v4, v1

    .line 445
    move v1, v6

    .line 446
    move/from16 v20, v7

    .line 447
    .line 448
    float-to-double v6, v4

    .line 449
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 450
    .line 451
    .line 452
    move-result-wide v6

    .line 453
    double-to-int v4, v6

    .line 454
    goto :goto_11

    .line 455
    :cond_24
    move-object/from16 p2, v1

    .line 456
    .line 457
    move v1, v6

    .line 458
    move/from16 v20, v7

    .line 459
    .line 460
    int-to-float v0, v15

    .line 461
    int-to-float v6, v4

    .line 462
    div-float/2addr v0, v6

    .line 463
    float-to-double v6, v0

    .line 464
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 465
    .line 466
    .line 467
    move-result-wide v6

    .line 468
    double-to-int v0, v6

    .line 469
    :goto_11
    iget-object v6, v8, Lq/h;->L0:[Lq/e;

    .line 470
    .line 471
    if-eqz v6, :cond_26

    .line 472
    .line 473
    array-length v7, v6

    .line 474
    if-ge v7, v0, :cond_25

    .line 475
    .line 476
    goto :goto_12

    .line 477
    :cond_25
    const/4 v7, 0x0

    .line 478
    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_26
    :goto_12
    const/4 v7, 0x0

    .line 483
    new-array v6, v0, [Lq/e;

    .line 484
    .line 485
    iput-object v6, v8, Lq/h;->L0:[Lq/e;

    .line 486
    .line 487
    :goto_13
    iget-object v6, v8, Lq/h;->K0:[Lq/e;

    .line 488
    .line 489
    if-eqz v6, :cond_28

    .line 490
    .line 491
    array-length v7, v6

    .line 492
    if-ge v7, v4, :cond_27

    .line 493
    .line 494
    goto :goto_14

    .line 495
    :cond_27
    const/4 v7, 0x0

    .line 496
    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    goto :goto_15

    .line 500
    :cond_28
    :goto_14
    new-array v6, v4, [Lq/e;

    .line 501
    .line 502
    iput-object v6, v8, Lq/h;->K0:[Lq/e;

    .line 503
    .line 504
    :goto_15
    const/4 v6, 0x0

    .line 505
    :goto_16
    if-ge v6, v0, :cond_31

    .line 506
    .line 507
    const/4 v7, 0x0

    .line 508
    :goto_17
    if-ge v7, v4, :cond_30

    .line 509
    .line 510
    mul-int v21, v7, v0

    .line 511
    .line 512
    add-int v21, v21, v6

    .line 513
    .line 514
    move/from16 v22, v1

    .line 515
    .line 516
    const/4 v1, 0x1

    .line 517
    if-ne v3, v1, :cond_29

    .line 518
    .line 519
    mul-int v1, v6, v4

    .line 520
    .line 521
    add-int v21, v1, v7

    .line 522
    .line 523
    :cond_29
    move/from16 v1, v21

    .line 524
    .line 525
    move/from16 v21, v9

    .line 526
    .line 527
    array-length v9, v14

    .line 528
    if-lt v1, v9, :cond_2a

    .line 529
    .line 530
    goto :goto_18

    .line 531
    :cond_2a
    aget-object v1, v14, v1

    .line 532
    .line 533
    if-nez v1, :cond_2b

    .line 534
    .line 535
    :goto_18
    move/from16 v23, v10

    .line 536
    .line 537
    goto :goto_19

    .line 538
    :cond_2b
    invoke-virtual {v8, v1, v2}, Lq/h;->D(Lq/e;I)I

    .line 539
    .line 540
    .line 541
    move-result v9

    .line 542
    move/from16 v23, v10

    .line 543
    .line 544
    iget-object v10, v8, Lq/h;->L0:[Lq/e;

    .line 545
    .line 546
    aget-object v10, v10, v6

    .line 547
    .line 548
    if-eqz v10, :cond_2c

    .line 549
    .line 550
    invoke-virtual {v10}, Lq/e;->m()I

    .line 551
    .line 552
    .line 553
    move-result v10

    .line 554
    if-ge v10, v9, :cond_2d

    .line 555
    .line 556
    :cond_2c
    iget-object v9, v8, Lq/h;->L0:[Lq/e;

    .line 557
    .line 558
    aput-object v1, v9, v6

    .line 559
    .line 560
    :cond_2d
    invoke-virtual {v8, v1, v2}, Lq/h;->C(Lq/e;I)I

    .line 561
    .line 562
    .line 563
    move-result v9

    .line 564
    iget-object v10, v8, Lq/h;->K0:[Lq/e;

    .line 565
    .line 566
    aget-object v10, v10, v7

    .line 567
    .line 568
    if-eqz v10, :cond_2e

    .line 569
    .line 570
    invoke-virtual {v10}, Lq/e;->j()I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-ge v10, v9, :cond_2f

    .line 575
    .line 576
    :cond_2e
    iget-object v9, v8, Lq/h;->K0:[Lq/e;

    .line 577
    .line 578
    aput-object v1, v9, v7

    .line 579
    .line 580
    :cond_2f
    :goto_19
    add-int/lit8 v7, v7, 0x1

    .line 581
    .line 582
    move/from16 v9, v21

    .line 583
    .line 584
    move/from16 v1, v22

    .line 585
    .line 586
    move/from16 v10, v23

    .line 587
    .line 588
    goto :goto_17

    .line 589
    :cond_30
    move/from16 v22, v1

    .line 590
    .line 591
    move/from16 v21, v9

    .line 592
    .line 593
    move/from16 v23, v10

    .line 594
    .line 595
    add-int/lit8 v6, v6, 0x1

    .line 596
    .line 597
    goto :goto_16

    .line 598
    :cond_31
    move/from16 v22, v1

    .line 599
    .line 600
    move/from16 v21, v9

    .line 601
    .line 602
    move/from16 v23, v10

    .line 603
    .line 604
    const/4 v1, 0x0

    .line 605
    const/4 v6, 0x0

    .line 606
    :goto_1a
    if-ge v1, v0, :cond_34

    .line 607
    .line 608
    iget-object v7, v8, Lq/h;->L0:[Lq/e;

    .line 609
    .line 610
    aget-object v7, v7, v1

    .line 611
    .line 612
    if-eqz v7, :cond_33

    .line 613
    .line 614
    if-lez v1, :cond_32

    .line 615
    .line 616
    iget v9, v8, Lq/h;->C0:I

    .line 617
    .line 618
    add-int/2addr v6, v9

    .line 619
    :cond_32
    invoke-virtual {v8, v7, v2}, Lq/h;->D(Lq/e;I)I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    add-int/2addr v7, v6

    .line 624
    move v6, v7

    .line 625
    :cond_33
    add-int/lit8 v1, v1, 0x1

    .line 626
    .line 627
    goto :goto_1a

    .line 628
    :cond_34
    const/4 v1, 0x0

    .line 629
    const/4 v7, 0x0

    .line 630
    :goto_1b
    if-ge v1, v4, :cond_37

    .line 631
    .line 632
    iget-object v9, v8, Lq/h;->K0:[Lq/e;

    .line 633
    .line 634
    aget-object v9, v9, v1

    .line 635
    .line 636
    if-eqz v9, :cond_36

    .line 637
    .line 638
    if-lez v1, :cond_35

    .line 639
    .line 640
    iget v10, v8, Lq/h;->D0:I

    .line 641
    .line 642
    add-int/2addr v7, v10

    .line 643
    :cond_35
    invoke-virtual {v8, v9, v2}, Lq/h;->C(Lq/e;I)I

    .line 644
    .line 645
    .line 646
    move-result v9

    .line 647
    add-int/2addr v9, v7

    .line 648
    move v7, v9

    .line 649
    :cond_36
    add-int/lit8 v1, v1, 0x1

    .line 650
    .line 651
    goto :goto_1b

    .line 652
    :cond_37
    const/4 v1, 0x0

    .line 653
    aput v6, v5, v1

    .line 654
    .line 655
    const/4 v1, 0x1

    .line 656
    aput v7, v5, v1

    .line 657
    .line 658
    if-nez v3, :cond_38

    .line 659
    .line 660
    if-le v6, v2, :cond_39

    .line 661
    .line 662
    if-le v0, v1, :cond_39

    .line 663
    .line 664
    add-int/lit8 v0, v0, -0x1

    .line 665
    .line 666
    goto :goto_1c

    .line 667
    :cond_38
    if-le v7, v2, :cond_39

    .line 668
    .line 669
    if-le v4, v1, :cond_39

    .line 670
    .line 671
    add-int/lit8 v4, v4, -0x1

    .line 672
    .line 673
    :goto_1c
    move-object/from16 v1, p2

    .line 674
    .line 675
    move/from16 v7, v20

    .line 676
    .line 677
    move/from16 v9, v21

    .line 678
    .line 679
    move/from16 v6, v22

    .line 680
    .line 681
    move/from16 v10, v23

    .line 682
    .line 683
    goto/16 :goto_10

    .line 684
    .line 685
    :cond_39
    move-object v9, v8

    .line 686
    move-object/from16 v17, v16

    .line 687
    .line 688
    move/from16 v7, v20

    .line 689
    .line 690
    move/from16 v6, v22

    .line 691
    .line 692
    move/from16 v10, v23

    .line 693
    .line 694
    move-object/from16 v8, p1

    .line 695
    .line 696
    move-object/from16 v16, v5

    .line 697
    .line 698
    move v5, v4

    .line 699
    move v4, v3

    .line 700
    move v3, v2

    .line 701
    move-object/from16 v2, p2

    .line 702
    .line 703
    :goto_1d
    move-object/from16 p1, v8

    .line 704
    .line 705
    move-object v8, v9

    .line 706
    move/from16 v9, v21

    .line 707
    .line 708
    move-object/from16 v38, v17

    .line 709
    .line 710
    move/from16 v17, v1

    .line 711
    .line 712
    move-object v1, v2

    .line 713
    move v2, v3

    .line 714
    move v3, v4

    .line 715
    move v4, v5

    .line 716
    move-object/from16 v5, v16

    .line 717
    .line 718
    move-object/from16 v16, v38

    .line 719
    .line 720
    goto/16 :goto_10

    .line 721
    .line 722
    :cond_3a
    move-object/from16 p2, v1

    .line 723
    .line 724
    move/from16 v22, v6

    .line 725
    .line 726
    move/from16 v20, v7

    .line 727
    .line 728
    move/from16 v21, v9

    .line 729
    .line 730
    move/from16 v23, v10

    .line 731
    .line 732
    const/4 v1, 0x1

    .line 733
    iget-object v2, v8, Lq/h;->M0:[I

    .line 734
    .line 735
    const/4 v3, 0x0

    .line 736
    aput v0, v2, v3

    .line 737
    .line 738
    aput v4, v2, v1

    .line 739
    .line 740
    move-object/from16 v0, p1

    .line 741
    .line 742
    move-object/from16 v8, p2

    .line 743
    .line 744
    move v10, v11

    .line 745
    move v11, v12

    .line 746
    move v12, v13

    .line 747
    move-object/from16 v2, v16

    .line 748
    .line 749
    move/from16 v3, v18

    .line 750
    .line 751
    move/from16 v5, v20

    .line 752
    .line 753
    move/from16 v6, v21

    .line 754
    .line 755
    move/from16 v4, v22

    .line 756
    .line 757
    move/from16 v9, v23

    .line 758
    .line 759
    goto/16 :goto_30

    .line 760
    .line 761
    :cond_3b
    move/from16 v18, v3

    .line 762
    .line 763
    iget v7, v8, Lq/h;->I0:I

    .line 764
    .line 765
    if-nez v14, :cond_3c

    .line 766
    .line 767
    move-object/from16 v19, p0

    .line 768
    .line 769
    move-object v0, v8

    .line 770
    move-object/from16 v2, v16

    .line 771
    .line 772
    move/from16 v3, v18

    .line 773
    .line 774
    goto/16 :goto_30

    .line 775
    .line 776
    :cond_3c
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 777
    .line 778
    .line 779
    new-instance v3, Lq/g;

    .line 780
    .line 781
    iget-object v2, v8, Lq/e;->x:Lq/d;

    .line 782
    .line 783
    iget-object v1, v8, Lq/e;->y:Lq/d;

    .line 784
    .line 785
    move/from16 v19, v5

    .line 786
    .line 787
    iget-object v5, v8, Lq/e;->z:Lq/d;

    .line 788
    .line 789
    move/from16 v20, v6

    .line 790
    .line 791
    iget-object v6, v8, Lq/e;->A:Lq/d;

    .line 792
    .line 793
    move/from16 v27, v0

    .line 794
    .line 795
    move-object v0, v3

    .line 796
    move-object/from16 v21, v1

    .line 797
    .line 798
    move-object/from16 v1, p1

    .line 799
    .line 800
    move-object/from16 v28, v16

    .line 801
    .line 802
    move-object/from16 v16, v2

    .line 803
    .line 804
    move v2, v7

    .line 805
    move/from16 v30, v9

    .line 806
    .line 807
    move/from16 v29, v18

    .line 808
    .line 809
    move-object v9, v3

    .line 810
    move-object/from16 v3, v16

    .line 811
    .line 812
    move/from16 v31, v4

    .line 813
    .line 814
    move-object/from16 v4, v21

    .line 815
    .line 816
    move/from16 v32, v19

    .line 817
    .line 818
    move/from16 v33, v20

    .line 819
    .line 820
    move/from16 v34, v7

    .line 821
    .line 822
    move/from16 p2, v10

    .line 823
    .line 824
    const/4 v10, 0x3

    .line 825
    move/from16 v7, v27

    .line 826
    .line 827
    invoke-direct/range {v0 .. v7}, Lq/g;-><init>(Lq/h;ILq/d;Lq/d;Lq/d;Lq/d;I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    if-nez v34, :cond_44

    .line 834
    .line 835
    move-object v3, v9

    .line 836
    const/4 v0, 0x0

    .line 837
    const/4 v1, 0x0

    .line 838
    const/4 v9, 0x0

    .line 839
    :goto_1e
    if-ge v9, v14, :cond_43

    .line 840
    .line 841
    aget-object v7, v13, v9

    .line 842
    .line 843
    move/from16 v6, v27

    .line 844
    .line 845
    invoke-virtual {v8, v7, v6}, Lq/h;->D(Lq/e;I)I

    .line 846
    .line 847
    .line 848
    move-result v16

    .line 849
    iget-object v2, v7, Lq/e;->c0:[I

    .line 850
    .line 851
    const/4 v4, 0x0

    .line 852
    aget v2, v2, v4

    .line 853
    .line 854
    if-ne v2, v10, :cond_3d

    .line 855
    .line 856
    add-int/lit8 v0, v0, 0x1

    .line 857
    .line 858
    :cond_3d
    move/from16 v18, v0

    .line 859
    .line 860
    if-eq v1, v6, :cond_3e

    .line 861
    .line 862
    iget v0, v8, Lq/h;->C0:I

    .line 863
    .line 864
    add-int/2addr v0, v1

    .line 865
    add-int v0, v0, v16

    .line 866
    .line 867
    if-le v0, v6, :cond_3f

    .line 868
    .line 869
    :cond_3e
    iget-object v0, v3, Lq/g;->b:Lq/e;

    .line 870
    .line 871
    if-eqz v0, :cond_3f

    .line 872
    .line 873
    const/4 v0, 0x1

    .line 874
    goto :goto_1f

    .line 875
    :cond_3f
    const/4 v0, 0x0

    .line 876
    :goto_1f
    if-nez v0, :cond_40

    .line 877
    .line 878
    if-lez v9, :cond_40

    .line 879
    .line 880
    iget v2, v8, Lq/h;->H0:I

    .line 881
    .line 882
    if-lez v2, :cond_40

    .line 883
    .line 884
    rem-int v2, v9, v2

    .line 885
    .line 886
    if-nez v2, :cond_40

    .line 887
    .line 888
    const/4 v0, 0x1

    .line 889
    :cond_40
    if-eqz v0, :cond_41

    .line 890
    .line 891
    new-instance v5, Lq/g;

    .line 892
    .line 893
    iget-object v3, v8, Lq/e;->x:Lq/d;

    .line 894
    .line 895
    iget-object v4, v8, Lq/e;->y:Lq/d;

    .line 896
    .line 897
    iget-object v2, v8, Lq/e;->z:Lq/d;

    .line 898
    .line 899
    iget-object v1, v8, Lq/e;->A:Lq/d;

    .line 900
    .line 901
    move-object v0, v5

    .line 902
    move-object/from16 v19, v1

    .line 903
    .line 904
    move-object/from16 v1, p1

    .line 905
    .line 906
    move-object/from16 v20, v2

    .line 907
    .line 908
    move/from16 v2, v34

    .line 909
    .line 910
    move-object v10, v5

    .line 911
    move-object/from16 v5, v20

    .line 912
    .line 913
    move/from16 v27, v6

    .line 914
    .line 915
    move-object/from16 v6, v19

    .line 916
    .line 917
    move/from16 v35, v11

    .line 918
    .line 919
    move-object v11, v7

    .line 920
    move/from16 v7, v27

    .line 921
    .line 922
    invoke-direct/range {v0 .. v7}, Lq/g;-><init>(Lq/h;ILq/d;Lq/d;Lq/d;Lq/d;I)V

    .line 923
    .line 924
    .line 925
    iput v9, v10, Lq/g;->n:I

    .line 926
    .line 927
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-object v3, v10

    .line 931
    goto :goto_20

    .line 932
    :cond_41
    move/from16 v27, v6

    .line 933
    .line 934
    move/from16 v35, v11

    .line 935
    .line 936
    move-object v11, v7

    .line 937
    if-lez v9, :cond_42

    .line 938
    .line 939
    iget v0, v8, Lq/h;->C0:I

    .line 940
    .line 941
    add-int v0, v0, v16

    .line 942
    .line 943
    add-int/2addr v0, v1

    .line 944
    move v1, v0

    .line 945
    goto :goto_21

    .line 946
    :cond_42
    :goto_20
    move/from16 v1, v16

    .line 947
    .line 948
    :goto_21
    invoke-virtual {v3, v11}, Lq/g;->a(Lq/e;)V

    .line 949
    .line 950
    .line 951
    add-int/lit8 v9, v9, 0x1

    .line 952
    .line 953
    move/from16 v0, v18

    .line 954
    .line 955
    move/from16 v11, v35

    .line 956
    .line 957
    const/4 v10, 0x3

    .line 958
    goto :goto_1e

    .line 959
    :cond_43
    move/from16 v35, v11

    .line 960
    .line 961
    goto/16 :goto_26

    .line 962
    .line 963
    :cond_44
    move/from16 v35, v11

    .line 964
    .line 965
    move-object v3, v9

    .line 966
    const/4 v0, 0x0

    .line 967
    const/4 v1, 0x0

    .line 968
    const/4 v9, 0x0

    .line 969
    :goto_22
    if-ge v9, v14, :cond_4b

    .line 970
    .line 971
    aget-object v10, v13, v9

    .line 972
    .line 973
    move/from16 v11, v27

    .line 974
    .line 975
    invoke-virtual {v8, v10, v11}, Lq/h;->C(Lq/e;I)I

    .line 976
    .line 977
    .line 978
    move-result v16

    .line 979
    iget-object v2, v10, Lq/e;->c0:[I

    .line 980
    .line 981
    const/4 v4, 0x1

    .line 982
    aget v2, v2, v4

    .line 983
    .line 984
    const/4 v7, 0x3

    .line 985
    if-ne v2, v7, :cond_45

    .line 986
    .line 987
    add-int/lit8 v0, v0, 0x1

    .line 988
    .line 989
    :cond_45
    move/from16 v18, v0

    .line 990
    .line 991
    if-eq v1, v11, :cond_46

    .line 992
    .line 993
    iget v0, v8, Lq/h;->D0:I

    .line 994
    .line 995
    add-int/2addr v0, v1

    .line 996
    add-int v0, v0, v16

    .line 997
    .line 998
    if-le v0, v11, :cond_47

    .line 999
    .line 1000
    :cond_46
    iget-object v0, v3, Lq/g;->b:Lq/e;

    .line 1001
    .line 1002
    if-eqz v0, :cond_47

    .line 1003
    .line 1004
    const/4 v0, 0x1

    .line 1005
    goto :goto_23

    .line 1006
    :cond_47
    const/4 v0, 0x0

    .line 1007
    :goto_23
    if-nez v0, :cond_48

    .line 1008
    .line 1009
    if-lez v9, :cond_48

    .line 1010
    .line 1011
    iget v2, v8, Lq/h;->H0:I

    .line 1012
    .line 1013
    if-lez v2, :cond_48

    .line 1014
    .line 1015
    rem-int v2, v9, v2

    .line 1016
    .line 1017
    if-nez v2, :cond_48

    .line 1018
    .line 1019
    const/4 v0, 0x1

    .line 1020
    :cond_48
    if-eqz v0, :cond_49

    .line 1021
    .line 1022
    new-instance v6, Lq/g;

    .line 1023
    .line 1024
    iget-object v3, v8, Lq/e;->x:Lq/d;

    .line 1025
    .line 1026
    iget-object v4, v8, Lq/e;->y:Lq/d;

    .line 1027
    .line 1028
    iget-object v5, v8, Lq/e;->z:Lq/d;

    .line 1029
    .line 1030
    iget-object v2, v8, Lq/e;->A:Lq/d;

    .line 1031
    .line 1032
    move-object v0, v6

    .line 1033
    move-object/from16 v1, p1

    .line 1034
    .line 1035
    move-object/from16 v19, v2

    .line 1036
    .line 1037
    move/from16 v2, v34

    .line 1038
    .line 1039
    move/from16 v27, v12

    .line 1040
    .line 1041
    move-object v12, v6

    .line 1042
    move-object/from16 v6, v19

    .line 1043
    .line 1044
    move/from16 v19, v7

    .line 1045
    .line 1046
    move v7, v11

    .line 1047
    invoke-direct/range {v0 .. v7}, Lq/g;-><init>(Lq/h;ILq/d;Lq/d;Lq/d;Lq/d;I)V

    .line 1048
    .line 1049
    .line 1050
    iput v9, v12, Lq/g;->n:I

    .line 1051
    .line 1052
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-object v3, v12

    .line 1056
    goto :goto_24

    .line 1057
    :cond_49
    move/from16 v19, v7

    .line 1058
    .line 1059
    move/from16 v27, v12

    .line 1060
    .line 1061
    if-lez v9, :cond_4a

    .line 1062
    .line 1063
    iget v0, v8, Lq/h;->D0:I

    .line 1064
    .line 1065
    add-int v0, v0, v16

    .line 1066
    .line 1067
    add-int/2addr v0, v1

    .line 1068
    move v1, v0

    .line 1069
    goto :goto_25

    .line 1070
    :cond_4a
    :goto_24
    move/from16 v1, v16

    .line 1071
    .line 1072
    :goto_25
    invoke-virtual {v3, v10}, Lq/g;->a(Lq/e;)V

    .line 1073
    .line 1074
    .line 1075
    add-int/lit8 v9, v9, 0x1

    .line 1076
    .line 1077
    move/from16 v0, v18

    .line 1078
    .line 1079
    move/from16 v12, v27

    .line 1080
    .line 1081
    move/from16 v27, v11

    .line 1082
    .line 1083
    goto :goto_22

    .line 1084
    :cond_4b
    :goto_26
    move/from16 v11, v27

    .line 1085
    .line 1086
    move/from16 v27, v12

    .line 1087
    .line 1088
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1089
    .line 1090
    .line 1091
    move-result v1

    .line 1092
    iget v2, v8, Lq/h;->j0:I

    .line 1093
    .line 1094
    iget v3, v8, Lq/h;->f0:I

    .line 1095
    .line 1096
    iget v4, v8, Lq/h;->k0:I

    .line 1097
    .line 1098
    iget v5, v8, Lq/h;->g0:I

    .line 1099
    .line 1100
    iget-object v6, v8, Lq/e;->c0:[I

    .line 1101
    .line 1102
    const/4 v7, 0x0

    .line 1103
    aget v9, v6, v7

    .line 1104
    .line 1105
    const/4 v7, 0x2

    .line 1106
    if-eq v9, v7, :cond_4d

    .line 1107
    .line 1108
    const/4 v9, 0x1

    .line 1109
    aget v6, v6, v9

    .line 1110
    .line 1111
    if-ne v6, v7, :cond_4c

    .line 1112
    .line 1113
    goto :goto_27

    .line 1114
    :cond_4c
    const/4 v6, 0x0

    .line 1115
    goto :goto_28

    .line 1116
    :cond_4d
    :goto_27
    const/4 v6, 0x1

    .line 1117
    :goto_28
    if-lez v0, :cond_4f

    .line 1118
    .line 1119
    if-eqz v6, :cond_4f

    .line 1120
    .line 1121
    const/4 v0, 0x0

    .line 1122
    :goto_29
    if-ge v0, v1, :cond_4f

    .line 1123
    .line 1124
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v6

    .line 1128
    check-cast v6, Lq/g;

    .line 1129
    .line 1130
    if-nez v34, :cond_4e

    .line 1131
    .line 1132
    invoke-virtual {v6}, Lq/g;->d()I

    .line 1133
    .line 1134
    .line 1135
    move-result v7

    .line 1136
    sub-int v7, v11, v7

    .line 1137
    .line 1138
    invoke-virtual {v6, v7}, Lq/g;->e(I)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_2a

    .line 1142
    :cond_4e
    invoke-virtual {v6}, Lq/g;->c()I

    .line 1143
    .line 1144
    .line 1145
    move-result v7

    .line 1146
    sub-int v7, v11, v7

    .line 1147
    .line 1148
    invoke-virtual {v6, v7}, Lq/g;->e(I)V

    .line 1149
    .line 1150
    .line 1151
    :goto_2a
    add-int/lit8 v0, v0, 0x1

    .line 1152
    .line 1153
    goto :goto_29

    .line 1154
    :cond_4f
    iget-object v0, v8, Lq/e;->A:Lq/d;

    .line 1155
    .line 1156
    iget-object v6, v8, Lq/e;->z:Lq/d;

    .line 1157
    .line 1158
    iget-object v7, v8, Lq/e;->x:Lq/d;

    .line 1159
    .line 1160
    iget-object v9, v8, Lq/e;->y:Lq/d;

    .line 1161
    .line 1162
    move-object v14, v0

    .line 1163
    move-object/from16 v36, v6

    .line 1164
    .line 1165
    const/4 v10, 0x0

    .line 1166
    const/4 v12, 0x0

    .line 1167
    const/4 v13, 0x0

    .line 1168
    :goto_2b
    if-ge v10, v1, :cond_55

    .line 1169
    .line 1170
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v16

    .line 1174
    move-object/from16 p3, v0

    .line 1175
    .line 1176
    move-object/from16 v0, v16

    .line 1177
    .line 1178
    check-cast v0, Lq/g;

    .line 1179
    .line 1180
    if-nez v34, :cond_52

    .line 1181
    .line 1182
    add-int/lit8 v5, v1, -0x1

    .line 1183
    .line 1184
    if-ge v10, v5, :cond_50

    .line 1185
    .line 1186
    add-int/lit8 v5, v10, 0x1

    .line 1187
    .line 1188
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v5

    .line 1192
    check-cast v5, Lq/g;

    .line 1193
    .line 1194
    iget-object v5, v5, Lq/g;->b:Lq/e;

    .line 1195
    .line 1196
    iget-object v5, v5, Lq/e;->y:Lq/d;

    .line 1197
    .line 1198
    move-object v14, v5

    .line 1199
    move-object/from16 v37, v6

    .line 1200
    .line 1201
    const/4 v5, 0x0

    .line 1202
    goto :goto_2c

    .line 1203
    :cond_50
    iget v5, v8, Lq/h;->g0:I

    .line 1204
    .line 1205
    move-object/from16 v14, p3

    .line 1206
    .line 1207
    move-object/from16 v37, v6

    .line 1208
    .line 1209
    :goto_2c
    iget-object v6, v0, Lq/g;->b:Lq/e;

    .line 1210
    .line 1211
    iget-object v6, v6, Lq/e;->A:Lq/d;

    .line 1212
    .line 1213
    move-object/from16 v16, v0

    .line 1214
    .line 1215
    move/from16 v17, v34

    .line 1216
    .line 1217
    move-object/from16 v18, v7

    .line 1218
    .line 1219
    move-object/from16 v19, v9

    .line 1220
    .line 1221
    move-object/from16 v20, v36

    .line 1222
    .line 1223
    move-object/from16 v21, v14

    .line 1224
    .line 1225
    move/from16 v22, v2

    .line 1226
    .line 1227
    move/from16 v23, v3

    .line 1228
    .line 1229
    move/from16 v24, v4

    .line 1230
    .line 1231
    move/from16 v25, v5

    .line 1232
    .line 1233
    move/from16 v26, v11

    .line 1234
    .line 1235
    invoke-virtual/range {v16 .. v26}, Lq/g;->f(ILq/d;Lq/d;Lq/d;Lq/d;IIIII)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v0}, Lq/g;->d()I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 1243
    .line 1244
    .line 1245
    move-result v3

    .line 1246
    invoke-virtual {v0}, Lq/g;->c()I

    .line 1247
    .line 1248
    .line 1249
    move-result v0

    .line 1250
    add-int/2addr v0, v13

    .line 1251
    if-lez v10, :cond_51

    .line 1252
    .line 1253
    iget v9, v8, Lq/h;->D0:I

    .line 1254
    .line 1255
    add-int/2addr v0, v9

    .line 1256
    :cond_51
    move v13, v0

    .line 1257
    move v12, v3

    .line 1258
    move-object v9, v6

    .line 1259
    const/4 v3, 0x0

    .line 1260
    goto :goto_2e

    .line 1261
    :cond_52
    move-object/from16 v37, v6

    .line 1262
    .line 1263
    add-int/lit8 v4, v1, -0x1

    .line 1264
    .line 1265
    if-ge v10, v4, :cond_53

    .line 1266
    .line 1267
    add-int/lit8 v4, v10, 0x1

    .line 1268
    .line 1269
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v4

    .line 1273
    check-cast v4, Lq/g;

    .line 1274
    .line 1275
    iget-object v4, v4, Lq/g;->b:Lq/e;

    .line 1276
    .line 1277
    iget-object v4, v4, Lq/e;->x:Lq/d;

    .line 1278
    .line 1279
    move-object/from16 v36, v4

    .line 1280
    .line 1281
    const/4 v4, 0x0

    .line 1282
    goto :goto_2d

    .line 1283
    :cond_53
    iget v4, v8, Lq/h;->k0:I

    .line 1284
    .line 1285
    move-object/from16 v36, v37

    .line 1286
    .line 1287
    :goto_2d
    iget-object v6, v0, Lq/g;->b:Lq/e;

    .line 1288
    .line 1289
    iget-object v6, v6, Lq/e;->z:Lq/d;

    .line 1290
    .line 1291
    move-object/from16 v16, v0

    .line 1292
    .line 1293
    move/from16 v17, v34

    .line 1294
    .line 1295
    move-object/from16 v18, v7

    .line 1296
    .line 1297
    move-object/from16 v19, v9

    .line 1298
    .line 1299
    move-object/from16 v20, v36

    .line 1300
    .line 1301
    move-object/from16 v21, v14

    .line 1302
    .line 1303
    move/from16 v22, v2

    .line 1304
    .line 1305
    move/from16 v23, v3

    .line 1306
    .line 1307
    move/from16 v24, v4

    .line 1308
    .line 1309
    move/from16 v25, v5

    .line 1310
    .line 1311
    move/from16 v26, v11

    .line 1312
    .line 1313
    invoke-virtual/range {v16 .. v26}, Lq/g;->f(ILq/d;Lq/d;Lq/d;Lq/d;IIIII)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v0}, Lq/g;->d()I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    add-int/2addr v2, v12

    .line 1321
    invoke-virtual {v0}, Lq/g;->c()I

    .line 1322
    .line 1323
    .line 1324
    move-result v0

    .line 1325
    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    .line 1326
    .line 1327
    .line 1328
    move-result v0

    .line 1329
    if-lez v10, :cond_54

    .line 1330
    .line 1331
    iget v7, v8, Lq/h;->C0:I

    .line 1332
    .line 1333
    add-int/2addr v2, v7

    .line 1334
    :cond_54
    move v13, v0

    .line 1335
    move v12, v2

    .line 1336
    move-object v7, v6

    .line 1337
    const/4 v2, 0x0

    .line 1338
    :goto_2e
    add-int/lit8 v10, v10, 0x1

    .line 1339
    .line 1340
    move-object/from16 v0, p3

    .line 1341
    .line 1342
    move-object/from16 v6, v37

    .line 1343
    .line 1344
    goto/16 :goto_2b

    .line 1345
    .line 1346
    :cond_55
    const/4 v0, 0x0

    .line 1347
    aput v12, v28, v0

    .line 1348
    .line 1349
    const/4 v0, 0x1

    .line 1350
    aput v13, v28, v0

    .line 1351
    .line 1352
    goto :goto_2f

    .line 1353
    :cond_56
    move/from16 v29, v3

    .line 1354
    .line 1355
    move/from16 v31, v4

    .line 1356
    .line 1357
    move/from16 v32, v5

    .line 1358
    .line 1359
    move/from16 v33, v6

    .line 1360
    .line 1361
    move/from16 v30, v9

    .line 1362
    .line 1363
    move/from16 p2, v10

    .line 1364
    .line 1365
    move/from16 v35, v11

    .line 1366
    .line 1367
    move/from16 v27, v12

    .line 1368
    .line 1369
    move-object/from16 v28, v16

    .line 1370
    .line 1371
    move v11, v0

    .line 1372
    iget v2, v8, Lq/h;->I0:I

    .line 1373
    .line 1374
    if-nez v14, :cond_57

    .line 1375
    .line 1376
    :goto_2f
    move-object/from16 v19, p0

    .line 1377
    .line 1378
    move/from16 v10, p2

    .line 1379
    .line 1380
    move-object v0, v8

    .line 1381
    move/from16 v12, v27

    .line 1382
    .line 1383
    move-object/from16 v2, v28

    .line 1384
    .line 1385
    move/from16 v3, v29

    .line 1386
    .line 1387
    move/from16 v9, v30

    .line 1388
    .line 1389
    move/from16 v4, v31

    .line 1390
    .line 1391
    move/from16 v5, v32

    .line 1392
    .line 1393
    move/from16 v6, v33

    .line 1394
    .line 1395
    move/from16 v11, v35

    .line 1396
    .line 1397
    :goto_30
    move-object/from16 v28, v2

    .line 1398
    .line 1399
    :goto_31
    const/4 v1, 0x0

    .line 1400
    const/4 v2, 0x1

    .line 1401
    goto/16 :goto_34

    .line 1402
    .line 1403
    :cond_57
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1404
    .line 1405
    .line 1406
    move-result v0

    .line 1407
    if-nez v0, :cond_58

    .line 1408
    .line 1409
    new-instance v9, Lq/g;

    .line 1410
    .line 1411
    iget-object v3, v8, Lq/e;->x:Lq/d;

    .line 1412
    .line 1413
    iget-object v4, v8, Lq/e;->y:Lq/d;

    .line 1414
    .line 1415
    iget-object v5, v8, Lq/e;->z:Lq/d;

    .line 1416
    .line 1417
    iget-object v6, v8, Lq/e;->A:Lq/d;

    .line 1418
    .line 1419
    move-object v0, v9

    .line 1420
    move-object/from16 v1, p1

    .line 1421
    .line 1422
    move v7, v11

    .line 1423
    invoke-direct/range {v0 .. v7}, Lq/g;-><init>(Lq/h;ILq/d;Lq/d;Lq/d;Lq/d;I)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    goto :goto_32

    .line 1430
    :cond_58
    const/4 v0, 0x0

    .line 1431
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    move-object v9, v1

    .line 1436
    check-cast v9, Lq/g;

    .line 1437
    .line 1438
    iput v0, v9, Lq/g;->c:I

    .line 1439
    .line 1440
    const/4 v1, 0x0

    .line 1441
    iput-object v1, v9, Lq/g;->b:Lq/e;

    .line 1442
    .line 1443
    iput v0, v9, Lq/g;->l:I

    .line 1444
    .line 1445
    iput v0, v9, Lq/g;->m:I

    .line 1446
    .line 1447
    iput v0, v9, Lq/g;->n:I

    .line 1448
    .line 1449
    iput v0, v9, Lq/g;->o:I

    .line 1450
    .line 1451
    iput v0, v9, Lq/g;->p:I

    .line 1452
    .line 1453
    iget-object v0, v8, Lq/e;->x:Lq/d;

    .line 1454
    .line 1455
    iget-object v1, v8, Lq/e;->y:Lq/d;

    .line 1456
    .line 1457
    iget-object v3, v8, Lq/e;->z:Lq/d;

    .line 1458
    .line 1459
    iget-object v4, v8, Lq/e;->A:Lq/d;

    .line 1460
    .line 1461
    iget v5, v8, Lq/h;->j0:I

    .line 1462
    .line 1463
    iget v6, v8, Lq/h;->f0:I

    .line 1464
    .line 1465
    iget v7, v8, Lq/h;->k0:I

    .line 1466
    .line 1467
    iget v10, v8, Lq/h;->g0:I

    .line 1468
    .line 1469
    move-object/from16 v16, v9

    .line 1470
    .line 1471
    move/from16 v17, v2

    .line 1472
    .line 1473
    move-object/from16 v18, v0

    .line 1474
    .line 1475
    move-object/from16 v19, v1

    .line 1476
    .line 1477
    move-object/from16 v20, v3

    .line 1478
    .line 1479
    move-object/from16 v21, v4

    .line 1480
    .line 1481
    move/from16 v22, v5

    .line 1482
    .line 1483
    move/from16 v23, v6

    .line 1484
    .line 1485
    move/from16 v24, v7

    .line 1486
    .line 1487
    move/from16 v25, v10

    .line 1488
    .line 1489
    move/from16 v26, v11

    .line 1490
    .line 1491
    invoke-virtual/range {v16 .. v26}, Lq/g;->f(ILq/d;Lq/d;Lq/d;Lq/d;IIIII)V

    .line 1492
    .line 1493
    .line 1494
    :goto_32
    const/4 v0, 0x0

    .line 1495
    :goto_33
    if-ge v0, v14, :cond_59

    .line 1496
    .line 1497
    aget-object v1, v13, v0

    .line 1498
    .line 1499
    invoke-virtual {v9, v1}, Lq/g;->a(Lq/e;)V

    .line 1500
    .line 1501
    .line 1502
    add-int/lit8 v0, v0, 0x1

    .line 1503
    .line 1504
    goto :goto_33

    .line 1505
    :cond_59
    invoke-virtual {v9}, Lq/g;->d()I

    .line 1506
    .line 1507
    .line 1508
    move-result v0

    .line 1509
    const/4 v1, 0x0

    .line 1510
    aput v0, v28, v1

    .line 1511
    .line 1512
    invoke-virtual {v9}, Lq/g;->c()I

    .line 1513
    .line 1514
    .line 1515
    move-result v0

    .line 1516
    const/4 v2, 0x1

    .line 1517
    aput v0, v28, v2

    .line 1518
    .line 1519
    move-object/from16 v19, p0

    .line 1520
    .line 1521
    move/from16 v10, p2

    .line 1522
    .line 1523
    move-object v0, v8

    .line 1524
    move/from16 v12, v27

    .line 1525
    .line 1526
    move/from16 v3, v29

    .line 1527
    .line 1528
    move/from16 v9, v30

    .line 1529
    .line 1530
    move/from16 v4, v31

    .line 1531
    .line 1532
    move/from16 v5, v32

    .line 1533
    .line 1534
    move/from16 v6, v33

    .line 1535
    .line 1536
    move/from16 v11, v35

    .line 1537
    .line 1538
    :goto_34
    aget v7, v28, v1

    .line 1539
    .line 1540
    add-int/2addr v7, v6

    .line 1541
    add-int v1, v7, v5

    .line 1542
    .line 1543
    aget v5, v28, v2

    .line 1544
    .line 1545
    add-int/2addr v5, v4

    .line 1546
    add-int/2addr v3, v5

    .line 1547
    const/high16 v4, -0x80000000

    .line 1548
    .line 1549
    const/high16 v5, 0x40000000    # 2.0f

    .line 1550
    .line 1551
    if-ne v9, v5, :cond_5a

    .line 1552
    .line 1553
    move v1, v10

    .line 1554
    goto :goto_35

    .line 1555
    :cond_5a
    if-ne v9, v4, :cond_5b

    .line 1556
    .line 1557
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    .line 1558
    .line 1559
    .line 1560
    move-result v1

    .line 1561
    goto :goto_35

    .line 1562
    :cond_5b
    if-nez v9, :cond_5c

    .line 1563
    .line 1564
    goto :goto_35

    .line 1565
    :cond_5c
    const/4 v1, 0x0

    .line 1566
    :goto_35
    if-ne v11, v5, :cond_5d

    .line 1567
    .line 1568
    move v3, v12

    .line 1569
    goto :goto_36

    .line 1570
    :cond_5d
    if-ne v11, v4, :cond_5e

    .line 1571
    .line 1572
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    .line 1573
    .line 1574
    .line 1575
    move-result v3

    .line 1576
    goto :goto_36

    .line 1577
    :cond_5e
    if-nez v11, :cond_5f

    .line 1578
    .line 1579
    goto :goto_36

    .line 1580
    :cond_5f
    const/4 v3, 0x0

    .line 1581
    :goto_36
    iput v1, v8, Lq/h;->m0:I

    .line 1582
    .line 1583
    iput v3, v8, Lq/h;->n0:I

    .line 1584
    .line 1585
    invoke-virtual {v8, v1}, Lq/e;->z(I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v8, v3}, Lq/e;->w(I)V

    .line 1589
    .line 1590
    .line 1591
    iget v1, v8, Lq/k;->e0:I

    .line 1592
    .line 1593
    if-lez v1, :cond_60

    .line 1594
    .line 1595
    move v13, v2

    .line 1596
    goto :goto_37

    .line 1597
    :cond_60
    const/4 v13, 0x0

    .line 1598
    :goto_37
    iput-boolean v13, v8, Lq/h;->l0:Z

    .line 1599
    .line 1600
    move-object/from16 v1, v19

    .line 1601
    .line 1602
    :goto_38
    iget v2, v0, Lq/h;->m0:I

    .line 1603
    .line 1604
    iget v0, v0, Lq/h;->n0:I

    .line 1605
    .line 1606
    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1607
    .line 1608
    .line 1609
    move-object/from16 v0, p0

    .line 1610
    .line 1611
    goto :goto_39

    .line 1612
    :cond_61
    move-object/from16 v0, p0

    .line 1613
    .line 1614
    move v1, v13

    .line 1615
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1616
    .line 1617
    .line 1618
    :goto_39
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Landroidx/constraintlayout/helper/widget/Flow;->h(Lq/h;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFirstHorizontalBias(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->y0:F

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setFirstHorizontalStyle(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->s0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setFirstVerticalBias(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->z0:F

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setFirstVerticalStyle(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->t0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHorizontalAlign(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->E0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHorizontalBias(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->w0:F

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHorizontalGap(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->C0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setHorizontalStyle(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->q0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setMaxElementsWrap(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->H0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->I0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->f0:I

    .line 4
    .line 5
    iput p1, v0, Lq/h;->g0:I

    .line 6
    .line 7
    iput p1, v0, Lq/h;->h0:I

    .line 8
    .line 9
    iput p1, v0, Lq/h;->i0:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setPaddingBottom(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->g0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPaddingLeft(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->j0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPaddingRight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->k0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPaddingTop(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->f0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVerticalAlign(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->F0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVerticalBias(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->x0:F

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVerticalGap(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->D0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setVerticalStyle(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->r0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setWrapMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->z:Lq/h;

    .line 2
    .line 3
    iput p1, v0, Lq/h;->G0:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
