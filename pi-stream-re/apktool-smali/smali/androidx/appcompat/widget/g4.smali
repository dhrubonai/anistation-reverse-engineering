.class public final Landroidx/appcompat/widget/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/u1;


# instance fields
.field public final a:Landroidx/appcompat/widget/Toolbar;

.field public b:I

.field public c:Landroid/view/View;

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Z

.field public h:Ljava/lang/CharSequence;

.field public i:Ljava/lang/CharSequence;

.field public j:Ljava/lang/CharSequence;

.field public k:Landroid/view/Window$Callback;

.field public l:Z

.field public m:Landroidx/appcompat/widget/m;

.field public n:I

.field public o:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/appcompat/widget/g4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Landroidx/appcompat/widget/g4;->h:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Landroidx/appcompat/widget/g4;->i:Ljava/lang/CharSequence;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->h:Ljava/lang/CharSequence;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move v1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v0

    .line 29
    :goto_0
    iput-boolean v1, p0, Landroidx/appcompat/widget/g4;->g:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Landroidx/appcompat/widget/g4;->f:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v3, Le/a;->a:[I

    .line 42
    .line 43
    const v4, 0x7f040006

    .line 44
    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-static {v1, v5, v3, v4}, Landroidx/appcompat/widget/o3;->m(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/appcompat/widget/o3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/16 v3, 0xf

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/o3;->e(I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v3, p0, Landroidx/appcompat/widget/g4;->o:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    const/16 v3, 0x1b

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    iput-boolean v2, p0, Landroidx/appcompat/widget/g4;->g:Z

    .line 72
    .line 73
    iput-object v3, p0, Landroidx/appcompat/widget/g4;->h:Ljava/lang/CharSequence;

    .line 74
    .line 75
    iget v2, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 76
    .line 77
    and-int/lit8 v2, v2, 0x8

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v2, p0, Landroidx/appcompat/widget/g4;->g:Z

    .line 85
    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v2, v3}, Lg0/y0;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    const/16 v2, 0x19

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_2

    .line 106
    .line 107
    iput-object v2, p0, Landroidx/appcompat/widget/g4;->i:Ljava/lang/CharSequence;

    .line 108
    .line 109
    iget v3, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 110
    .line 111
    and-int/lit8 v3, v3, 0x8

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    const/16 v2, 0x14

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->e(I)Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    iput-object v2, p0, Landroidx/appcompat/widget/g4;->e:Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/appcompat/widget/g4;->b()V

    .line 129
    .line 130
    .line 131
    :cond_3
    const/16 v2, 0x11

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->e(I)Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    iput-object v2, p0, Landroidx/appcompat/widget/g4;->d:Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/appcompat/widget/g4;->b()V

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object v2, p0, Landroidx/appcompat/widget/g4;->f:Landroid/graphics/drawable/Drawable;

    .line 145
    .line 146
    if-nez v2, :cond_6

    .line 147
    .line 148
    iget-object v2, p0, Landroidx/appcompat/widget/g4;->o:Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    if-eqz v2, :cond_6

    .line 151
    .line 152
    iput-object v2, p0, Landroidx/appcompat/widget/g4;->f:Landroid/graphics/drawable/Drawable;

    .line 153
    .line 154
    iget v3, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 155
    .line 156
    and-int/lit8 v3, v3, 0x4

    .line 157
    .line 158
    if-eqz v3, :cond_5

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-virtual {p1, v5}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    :goto_1
    const/16 v2, 0xa

    .line 168
    .line 169
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/g4;->a(I)V

    .line 174
    .line 175
    .line 176
    const/16 v2, 0x9

    .line 177
    .line 178
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_9

    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v3, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iget-object v3, p0, Landroidx/appcompat/widget/g4;->c:Landroid/view/View;

    .line 197
    .line 198
    if-eqz v3, :cond_7

    .line 199
    .line 200
    iget v4, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 201
    .line 202
    and-int/lit8 v4, v4, 0x10

    .line 203
    .line 204
    if-eqz v4, :cond_7

    .line 205
    .line 206
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    iput-object v2, p0, Landroidx/appcompat/widget/g4;->c:Landroid/view/View;

    .line 210
    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    iget v3, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 214
    .line 215
    and-int/lit8 v3, v3, 0x10

    .line 216
    .line 217
    if-eqz v3, :cond_8

    .line 218
    .line 219
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    :cond_8
    iget v2, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 223
    .line 224
    or-int/lit8 v2, v2, 0x10

    .line 225
    .line 226
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/g4;->a(I)V

    .line 227
    .line 228
    .line 229
    :cond_9
    iget-object v2, v1, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v2, Landroid/content/res/TypedArray;

    .line 232
    .line 233
    const/16 v3, 0xd

    .line 234
    .line 235
    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_a

    .line 240
    .line 241
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 246
    .line 247
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 248
    .line 249
    .line 250
    :cond_a
    const/4 v2, 0x7

    .line 251
    const/4 v3, -0x1

    .line 252
    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/widget/o3;->c(II)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    const/4 v4, 0x3

    .line 257
    invoke-virtual {v1, v4, v3}, Landroidx/appcompat/widget/o3;->c(II)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-gez v2, :cond_b

    .line 262
    .line 263
    if-ltz v3, :cond_d

    .line 264
    .line 265
    :cond_b
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    iget-object v4, p1, Landroidx/appcompat/widget/Toolbar;->K:Landroidx/appcompat/widget/a3;

    .line 274
    .line 275
    if-nez v4, :cond_c

    .line 276
    .line 277
    new-instance v4, Landroidx/appcompat/widget/a3;

    .line 278
    .line 279
    invoke-direct {v4}, Landroidx/appcompat/widget/a3;-><init>()V

    .line 280
    .line 281
    .line 282
    iput-object v4, p1, Landroidx/appcompat/widget/Toolbar;->K:Landroidx/appcompat/widget/a3;

    .line 283
    .line 284
    :cond_c
    iget-object v4, p1, Landroidx/appcompat/widget/Toolbar;->K:Landroidx/appcompat/widget/a3;

    .line 285
    .line 286
    invoke-virtual {v4, v2, v3}, Landroidx/appcompat/widget/a3;->a(II)V

    .line 287
    .line 288
    .line 289
    :cond_d
    const/16 v2, 0x1c

    .line 290
    .line 291
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_e

    .line 296
    .line 297
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    iput v2, p1, Landroidx/appcompat/widget/Toolbar;->C:I

    .line 302
    .line 303
    iget-object v4, p1, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/i1;

    .line 304
    .line 305
    if-eqz v4, :cond_e

    .line 306
    .line 307
    invoke-virtual {v4, v3, v2}, Landroidx/appcompat/widget/i1;->setTextAppearance(Landroid/content/Context;I)V

    .line 308
    .line 309
    .line 310
    :cond_e
    const/16 v2, 0x1a

    .line 311
    .line 312
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_f

    .line 317
    .line 318
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    iput v2, p1, Landroidx/appcompat/widget/Toolbar;->D:I

    .line 323
    .line 324
    iget-object v4, p1, Landroidx/appcompat/widget/Toolbar;->c:Landroidx/appcompat/widget/i1;

    .line 325
    .line 326
    if-eqz v4, :cond_f

    .line 327
    .line 328
    invoke-virtual {v4, v3, v2}, Landroidx/appcompat/widget/i1;->setTextAppearance(Landroid/content/Context;I)V

    .line 329
    .line 330
    .line 331
    :cond_f
    const/16 v2, 0x16

    .line 332
    .line 333
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_10

    .line 338
    .line 339
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    .line 340
    .line 341
    .line 342
    :cond_10
    invoke-virtual {v1}, Landroidx/appcompat/widget/o3;->p()V

    .line 343
    .line 344
    .line 345
    iget v0, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 346
    .line 347
    const v1, 0x7f120001

    .line 348
    .line 349
    .line 350
    if-ne v1, v0, :cond_11

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_11
    iput v1, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 354
    .line 355
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_14

    .line 364
    .line 365
    iget v0, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 366
    .line 367
    if-nez v0, :cond_12

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    :goto_2
    iput-object v5, p0, Landroidx/appcompat/widget/g4;->j:Ljava/lang/CharSequence;

    .line 379
    .line 380
    iget v0, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 381
    .line 382
    and-int/lit8 v0, v0, 0x4

    .line 383
    .line 384
    if-eqz v0, :cond_14

    .line 385
    .line 386
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_13

    .line 391
    .line 392
    iget v0, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 393
    .line 394
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_13
    iget-object v0, p0, Landroidx/appcompat/widget/g4;->j:Ljava/lang/CharSequence;

    .line 399
    .line 400
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    .line 401
    .line 402
    .line 403
    :cond_14
    :goto_3
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    iput-object v0, p0, Landroidx/appcompat/widget/g4;->j:Ljava/lang/CharSequence;

    .line 408
    .line 409
    new-instance v0, Landroidx/appcompat/widget/c;

    .line 410
    .line 411
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/c;-><init>(Landroidx/appcompat/widget/g4;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 415
    .line 416
    .line 417
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 2
    .line 3
    xor-int/2addr v0, p1

    .line 4
    iput p1, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    and-int/lit8 v1, v0, 0x4

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Landroidx/appcompat/widget/g4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    and-int/lit8 v1, p1, 0x4

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    and-int/lit8 v1, p1, 0x4

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->j:Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget v1, p0, Landroidx/appcompat/widget/g4;->n:I

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->j:Ljava/lang/CharSequence;

    .line 38
    .line 39
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget v1, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 43
    .line 44
    and-int/lit8 v1, v1, 0x4

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->f:Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->o:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    :goto_1
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_2
    and-int/lit8 v1, v0, 0x3

    .line 63
    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/appcompat/widget/g4;->b()V

    .line 67
    .line 68
    .line 69
    :cond_5
    and-int/lit8 v1, v0, 0x8

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    and-int/lit8 v1, p1, 0x8

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->h:Ljava/lang/CharSequence;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->i:Ljava/lang/CharSequence;

    .line 83
    .line 84
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    :goto_3
    and-int/lit8 v0, v0, 0x10

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    iget-object v0, p0, Landroidx/appcompat/widget/g4;->c:Landroid/view/View;

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    and-int/lit8 p1, p1, 0x10

    .line 103
    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    :cond_9
    :goto_4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/g4;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/g4;->e:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/g4;->d:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/g4;->d:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/g4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
