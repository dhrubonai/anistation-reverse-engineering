.class public Lcom/google/android/material/textfield/TextInputLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final P0:[[I


# instance fields
.field public final A:Lm6/r;

.field public A0:I

.field public B:Z

.field public B0:I

.field public C:I

.field public C0:Landroid/content/res/ColorStateList;

.field public D:Z

.field public D0:I

.field public E:Lm6/y;

.field public E0:I

.field public F:Landroidx/appcompat/widget/i1;

.field public F0:I

.field public G:I

.field public G0:I

.field public H:I

.field public H0:I

.field public I:Ljava/lang/CharSequence;

.field public I0:Z

.field public J:Z

.field public final J0:Le6/b;

.field public K:Landroidx/appcompat/widget/i1;

.field public K0:Z

.field public L:Landroid/content/res/ColorStateList;

.field public L0:Z

.field public M:I

.field public M0:Landroid/animation/ValueAnimator;

.field public N:Lq3/i;

.field public N0:Z

.field public O:Lq3/i;

.field public O0:Z

.field public P:Landroid/content/res/ColorStateList;

.field public Q:Landroid/content/res/ColorStateList;

.field public R:Z

.field public S:Ljava/lang/CharSequence;

.field public T:Z

.field public U:Lj6/g;

.field public V:Lj6/g;

.field public W:Landroid/graphics/drawable/StateListDrawable;

.field public final a:Landroid/widget/FrameLayout;

.field public a0:Z

.field public final b:Lm6/v;

.field public b0:Lj6/g;

.field public final c:Lm6/n;

.field public c0:Lj6/g;

.field public d:Landroid/widget/EditText;

.field public d0:Lj6/k;

.field public e:Ljava/lang/CharSequence;

.field public e0:Z

.field public f:I

.field public final f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:I

.field public final n0:Landroid/graphics/Rect;

.field public final o0:Landroid/graphics/Rect;

.field public final p0:Landroid/graphics/RectF;

.field public q0:Landroid/graphics/Typeface;

.field public r0:Landroid/graphics/drawable/ColorDrawable;

.field public s0:I

.field public final t0:Ljava/util/LinkedHashSet;

.field public u0:Landroid/graphics/drawable/ColorDrawable;

.field public v0:I

.field public w0:Landroid/graphics/drawable/Drawable;

.field public x:I

.field public x0:Landroid/content/res/ColorStateList;

.field public y:I

.field public y0:Landroid/content/res/ColorStateList;

.field public z:I

.field public z0:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [[I

    .line 3
    .line 4
    const v1, 0x10100a7

    .line 5
    .line 6
    .line 7
    filled-new-array {v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v2, v2, [I

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    sput-object v0, Lcom/google/android/material/textfield/TextInputLayout;->P0:[[I

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    const v8, 0x7f040456

    .line 6
    .line 7
    .line 8
    const v9, 0x7f130356

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v7, v8, v9}, Lw7/b;->Z(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, v7, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    const/4 v10, -0x1

    .line 21
    iput v10, v0, Lcom/google/android/material/textfield/TextInputLayout;->f:I

    .line 22
    .line 23
    iput v10, v0, Lcom/google/android/material/textfield/TextInputLayout;->x:I

    .line 24
    .line 25
    iput v10, v0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 26
    .line 27
    iput v10, v0, Lcom/google/android/material/textfield/TextInputLayout;->z:I

    .line 28
    .line 29
    new-instance v1, Lm6/r;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lm6/r;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 35
    .line 36
    new-instance v1, Lh3/e;

    .line 37
    .line 38
    const/4 v11, 0x4

    .line 39
    invoke-direct {v1, v11}, Lh3/e;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->E:Lm6/y;

    .line 43
    .line 44
    new-instance v1, Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/Rect;

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Rect;

    .line 57
    .line 58
    new-instance v1, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 64
    .line 65
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->t0:Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    new-instance v1, Le6/b;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Le6/b;-><init>(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    const/4 v13, 0x1

    .line 84
    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    invoke-virtual {v0, v14}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 92
    .line 93
    .line 94
    new-instance v15, Landroid/widget/FrameLayout;

    .line 95
    .line 96
    invoke-direct {v15, v12}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    iput-object v15, v0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 100
    .line 101
    invoke-virtual {v15, v13}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lt5/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 105
    .line 106
    iput-object v2, v1, Le6/b;->Q:Landroid/animation/TimeInterpolator;

    .line 107
    .line 108
    invoke-virtual {v1, v14}, Le6/b;->h(Z)V

    .line 109
    .line 110
    .line 111
    iput-object v2, v1, Le6/b;->P:Landroid/animation/TimeInterpolator;

    .line 112
    .line 113
    invoke-virtual {v1, v14}, Le6/b;->h(Z)V

    .line 114
    .line 115
    .line 116
    iget v2, v1, Le6/b;->g:I

    .line 117
    .line 118
    const v3, 0x800033

    .line 119
    .line 120
    .line 121
    if-eq v2, v3, :cond_0

    .line 122
    .line 123
    iput v3, v1, Le6/b;->g:I

    .line 124
    .line 125
    invoke-virtual {v1, v14}, Le6/b;->h(Z)V

    .line 126
    .line 127
    .line 128
    :cond_0
    sget-object v6, Ls5/a;->z:[I

    .line 129
    .line 130
    const/16 v5, 0x16

    .line 131
    .line 132
    const/16 v4, 0x14

    .line 133
    .line 134
    const/16 v3, 0x26

    .line 135
    .line 136
    const/16 v2, 0x2b

    .line 137
    .line 138
    const/16 v1, 0x2f

    .line 139
    .line 140
    filled-new-array {v5, v4, v3, v2, v1}, [I

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    invoke-static {v12, v7, v8, v9}, Lw7/b;->k(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 145
    .line 146
    .line 147
    const v17, 0x7f040456

    .line 148
    .line 149
    .line 150
    const v18, 0x7f130356

    .line 151
    .line 152
    .line 153
    move-object v1, v12

    .line 154
    move-object/from16 v2, p2

    .line 155
    .line 156
    move-object v3, v6

    .line 157
    move/from16 v4, v17

    .line 158
    .line 159
    move/from16 v5, v18

    .line 160
    .line 161
    move-object v14, v6

    .line 162
    move-object/from16 v6, v16

    .line 163
    .line 164
    invoke-static/range {v1 .. v6}, Lw7/b;->y(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Landroidx/appcompat/widget/o3;

    .line 168
    .line 169
    invoke-virtual {v12, v7, v14, v8, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-direct {v1, v12, v2}, Landroidx/appcompat/widget/o3;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 174
    .line 175
    .line 176
    new-instance v3, Lm6/v;

    .line 177
    .line 178
    invoke-direct {v3, v0, v1}, Lm6/v;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroidx/appcompat/widget/o3;)V

    .line 179
    .line 180
    .line 181
    iput-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 182
    .line 183
    const/16 v4, 0x2e

    .line 184
    .line 185
    invoke-virtual {v1, v4, v13}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    iput-boolean v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 190
    .line 191
    invoke-virtual {v1, v11}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    .line 198
    const/16 v4, 0x2d

    .line 199
    .line 200
    invoke-virtual {v1, v4, v13}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    iput-boolean v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 205
    .line 206
    const/16 v4, 0x28

    .line 207
    .line 208
    invoke-virtual {v1, v4, v13}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    iput-boolean v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Z

    .line 213
    .line 214
    const/4 v4, 0x6

    .line 215
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_1

    .line 220
    .line 221
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    .line 226
    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_1
    const/4 v4, 0x3

    .line 230
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_2

    .line 235
    .line 236
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->d(II)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 241
    .line 242
    .line 243
    :cond_2
    :goto_0
    const/4 v4, 0x5

    .line 244
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    const/4 v6, 0x2

    .line 249
    if-eqz v5, :cond_3

    .line 250
    .line 251
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_3
    invoke-virtual {v1, v6}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_4

    .line 264
    .line 265
    invoke-virtual {v1, v6, v10}, Landroidx/appcompat/widget/o3;->d(II)I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 270
    .line 271
    .line 272
    :cond_4
    :goto_1
    invoke-static {v12, v7, v8, v9}, Lj6/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lj6/j;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    new-instance v5, Lj6/k;

    .line 277
    .line 278
    invoke-direct {v5, v4}, Lj6/k;-><init>(Lj6/j;)V

    .line 279
    .line 280
    .line 281
    iput-object v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 282
    .line 283
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    const v5, 0x7f070307

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 295
    .line 296
    const/16 v4, 0x9

    .line 297
    .line 298
    const/4 v5, 0x0

    .line 299
    invoke-virtual {v1, v4, v5}, Landroidx/appcompat/widget/o3;->c(II)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 304
    .line 305
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    const v5, 0x7f070308

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    const/16 v5, 0x10

    .line 317
    .line 318
    invoke-virtual {v1, v5, v4}, Landroidx/appcompat/widget/o3;->d(II)I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 323
    .line 324
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    const v5, 0x7f070309

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    const/16 v5, 0x11

    .line 336
    .line 337
    invoke-virtual {v1, v5, v4}, Landroidx/appcompat/widget/o3;->d(II)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 342
    .line 343
    iget v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 344
    .line 345
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 346
    .line 347
    const/16 v4, 0xd

    .line 348
    .line 349
    const/high16 v5, -0x40800000    # -1.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    const/16 v7, 0xc

    .line 356
    .line 357
    invoke-virtual {v2, v7, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    const/16 v8, 0xa

    .line 362
    .line 363
    invoke-virtual {v2, v8, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    const/16 v9, 0xb

    .line 368
    .line 369
    invoke-virtual {v2, v9, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    iget-object v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 374
    .line 375
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    new-instance v11, Lj6/j;

    .line 379
    .line 380
    invoke-direct {v11, v9}, Lj6/j;-><init>(Lj6/k;)V

    .line 381
    .line 382
    .line 383
    const/4 v9, 0x0

    .line 384
    cmpl-float v14, v4, v9

    .line 385
    .line 386
    if-ltz v14, :cond_5

    .line 387
    .line 388
    new-instance v14, Lj6/a;

    .line 389
    .line 390
    invoke-direct {v14, v4}, Lj6/a;-><init>(F)V

    .line 391
    .line 392
    .line 393
    iput-object v14, v11, Lj6/j;->e:Lj6/c;

    .line 394
    .line 395
    :cond_5
    cmpl-float v4, v7, v9

    .line 396
    .line 397
    if-ltz v4, :cond_6

    .line 398
    .line 399
    new-instance v4, Lj6/a;

    .line 400
    .line 401
    invoke-direct {v4, v7}, Lj6/a;-><init>(F)V

    .line 402
    .line 403
    .line 404
    iput-object v4, v11, Lj6/j;->f:Lj6/c;

    .line 405
    .line 406
    :cond_6
    cmpl-float v4, v8, v9

    .line 407
    .line 408
    if-ltz v4, :cond_7

    .line 409
    .line 410
    new-instance v4, Lj6/a;

    .line 411
    .line 412
    invoke-direct {v4, v8}, Lj6/a;-><init>(F)V

    .line 413
    .line 414
    .line 415
    iput-object v4, v11, Lj6/j;->g:Lj6/c;

    .line 416
    .line 417
    :cond_7
    cmpl-float v4, v5, v9

    .line 418
    .line 419
    if-ltz v4, :cond_8

    .line 420
    .line 421
    new-instance v4, Lj6/a;

    .line 422
    .line 423
    invoke-direct {v4, v5}, Lj6/a;-><init>(F)V

    .line 424
    .line 425
    .line 426
    iput-object v4, v11, Lj6/j;->h:Lj6/c;

    .line 427
    .line 428
    :cond_8
    new-instance v4, Lj6/k;

    .line 429
    .line 430
    invoke-direct {v4, v11}, Lj6/k;-><init>(Lj6/j;)V

    .line 431
    .line 432
    .line 433
    iput-object v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 434
    .line 435
    const/4 v4, 0x7

    .line 436
    invoke-static {v12, v1, v4}, Lp7/a0;->v(Landroid/content/Context;Landroidx/appcompat/widget/o3;I)Landroid/content/res/ColorStateList;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    if-eqz v4, :cond_a

    .line 441
    .line 442
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    iput v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 447
    .line 448
    iput v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 449
    .line 450
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    const v7, 0x1010367

    .line 455
    .line 456
    .line 457
    const v8, -0x101009e

    .line 458
    .line 459
    .line 460
    if-eqz v5, :cond_9

    .line 461
    .line 462
    filled-new-array {v8}, [I

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-virtual {v4, v5, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 467
    .line 468
    .line 469
    move-result v5

    .line 470
    iput v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 471
    .line 472
    const v5, 0x101009c

    .line 473
    .line 474
    .line 475
    const v8, 0x101009e

    .line 476
    .line 477
    .line 478
    filled-new-array {v5, v8}, [I

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-virtual {v4, v5, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    iput v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 487
    .line 488
    filled-new-array {v7, v8}, [I

    .line 489
    .line 490
    .line 491
    move-result-object v5

    .line 492
    invoke-virtual {v4, v5, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_9
    iget v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 500
    .line 501
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 502
    .line 503
    const v4, 0x7f0602cd

    .line 504
    .line 505
    .line 506
    invoke-static {v12, v4}, Lx/j;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    filled-new-array {v8}, [I

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    invoke-virtual {v4, v5, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    iput v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 519
    .line 520
    filled-new-array {v7}, [I

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    invoke-virtual {v4, v5, v10}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 529
    .line 530
    goto :goto_2

    .line 531
    :cond_a
    const/4 v4, 0x0

    .line 532
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 533
    .line 534
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 535
    .line 536
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 537
    .line 538
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 539
    .line 540
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 541
    .line 542
    :goto_2
    invoke-virtual {v1, v13}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    if-eqz v4, :cond_b

    .line 547
    .line 548
    invoke-virtual {v1, v13}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    iput-object v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 553
    .line 554
    iput-object v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 555
    .line 556
    :cond_b
    const/16 v4, 0xe

    .line 557
    .line 558
    invoke-static {v12, v1, v4}, Lp7/a0;->v(Landroid/content/Context;Landroidx/appcompat/widget/o3;I)Landroid/content/res/ColorStateList;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    const/4 v7, 0x0

    .line 563
    invoke-virtual {v2, v4, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 568
    .line 569
    const v2, 0x7f0602e8

    .line 570
    .line 571
    .line 572
    invoke-static {v12, v2}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 577
    .line 578
    const v2, 0x7f0602e9

    .line 579
    .line 580
    .line 581
    invoke-static {v12, v2}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->H0:I

    .line 586
    .line 587
    const v2, 0x7f0602ec

    .line 588
    .line 589
    .line 590
    invoke-static {v12, v2}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->A0:I

    .line 595
    .line 596
    if-eqz v5, :cond_c

    .line 597
    .line 598
    invoke-virtual {v0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V

    .line 599
    .line 600
    .line 601
    :cond_c
    const/16 v2, 0xf

    .line 602
    .line 603
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-eqz v4, :cond_d

    .line 608
    .line 609
    invoke-static {v12, v1, v2}, Lp7/a0;->v(Landroid/content/Context;Landroidx/appcompat/widget/o3;I)Landroid/content/res/ColorStateList;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V

    .line 614
    .line 615
    .line 616
    :cond_d
    const/16 v2, 0x2f

    .line 617
    .line 618
    invoke-virtual {v1, v2, v10}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    if-eq v4, v10, :cond_e

    .line 623
    .line 624
    const/4 v4, 0x0

    .line 625
    invoke-virtual {v1, v2, v4}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextAppearance(I)V

    .line 630
    .line 631
    .line 632
    goto :goto_3

    .line 633
    :cond_e
    const/4 v4, 0x0

    .line 634
    :goto_3
    const/16 v2, 0x26

    .line 635
    .line 636
    invoke-virtual {v1, v2, v4}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    const/16 v5, 0x21

    .line 641
    .line 642
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    const/16 v7, 0x20

    .line 647
    .line 648
    invoke-virtual {v1, v7, v13}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 649
    .line 650
    .line 651
    move-result v7

    .line 652
    const/16 v8, 0x22

    .line 653
    .line 654
    invoke-virtual {v1, v8, v4}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    const/16 v9, 0x2b

    .line 659
    .line 660
    invoke-virtual {v1, v9, v4}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    const/16 v11, 0x2a

    .line 665
    .line 666
    invoke-virtual {v1, v11, v4}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 667
    .line 668
    .line 669
    move-result v11

    .line 670
    const/16 v12, 0x29

    .line 671
    .line 672
    invoke-virtual {v1, v12}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 673
    .line 674
    .line 675
    move-result-object v12

    .line 676
    const/16 v14, 0x37

    .line 677
    .line 678
    invoke-virtual {v1, v14, v4}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 679
    .line 680
    .line 681
    move-result v14

    .line 682
    const/16 v6, 0x36

    .line 683
    .line 684
    invoke-virtual {v1, v6}, Landroidx/appcompat/widget/o3;->k(I)Ljava/lang/CharSequence;

    .line 685
    .line 686
    .line 687
    move-result-object v6

    .line 688
    const/16 v13, 0x12

    .line 689
    .line 690
    invoke-virtual {v1, v13, v4}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 691
    .line 692
    .line 693
    move-result v13

    .line 694
    const/16 v4, 0x13

    .line 695
    .line 696
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterMaxLength(I)V

    .line 701
    .line 702
    .line 703
    const/16 v4, 0x16

    .line 704
    .line 705
    const/4 v10, 0x0

    .line 706
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 711
    .line 712
    const/16 v4, 0x14

    .line 713
    .line 714
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->i(II)I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 719
    .line 720
    const/16 v4, 0x8

    .line 721
    .line 722
    invoke-virtual {v1, v4, v10}, Landroidx/appcompat/widget/o3;->h(II)I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorContentDescription(Ljava/lang/CharSequence;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorAccessibilityLiveRegion(I)V

    .line 733
    .line 734
    .line 735
    iget v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 736
    .line 737
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextAppearance(I)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextTextAppearance(I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextAppearance(I)V

    .line 744
    .line 745
    .line 746
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 747
    .line 748
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextAppearance(I)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v0, v6}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v0, v14}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    .line 755
    .line 756
    .line 757
    const/16 v2, 0x27

    .line 758
    .line 759
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    if-eqz v4, :cond_f

    .line 764
    .line 765
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextColor(Landroid/content/res/ColorStateList;)V

    .line 770
    .line 771
    .line 772
    :cond_f
    const/16 v2, 0x2c

    .line 773
    .line 774
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 775
    .line 776
    .line 777
    move-result v4

    .line 778
    if-eqz v4, :cond_10

    .line 779
    .line 780
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextColor(Landroid/content/res/ColorStateList;)V

    .line 785
    .line 786
    .line 787
    :cond_10
    const/16 v2, 0x30

    .line 788
    .line 789
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 790
    .line 791
    .line 792
    move-result v4

    .line 793
    if-eqz v4, :cond_11

    .line 794
    .line 795
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 800
    .line 801
    .line 802
    :cond_11
    const/16 v2, 0x17

    .line 803
    .line 804
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 805
    .line 806
    .line 807
    move-result v4

    .line 808
    if-eqz v4, :cond_12

    .line 809
    .line 810
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextColor(Landroid/content/res/ColorStateList;)V

    .line 815
    .line 816
    .line 817
    :cond_12
    const/16 v2, 0x15

    .line 818
    .line 819
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    if-eqz v4, :cond_13

    .line 824
    .line 825
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V

    .line 830
    .line 831
    .line 832
    :cond_13
    const/16 v2, 0x38

    .line 833
    .line 834
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->l(I)Z

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    if-eqz v4, :cond_14

    .line 839
    .line 840
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/o3;->b(I)Landroid/content/res/ColorStateList;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    .line 845
    .line 846
    .line 847
    :cond_14
    new-instance v2, Lm6/n;

    .line 848
    .line 849
    invoke-direct {v2, v0, v1}, Lm6/n;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroidx/appcompat/widget/o3;)V

    .line 850
    .line 851
    .line 852
    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 853
    .line 854
    const/4 v4, 0x1

    .line 855
    const/4 v5, 0x0

    .line 856
    invoke-virtual {v1, v5, v4}, Landroidx/appcompat/widget/o3;->a(IZ)Z

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    invoke-virtual {v1}, Landroidx/appcompat/widget/o3;->p()V

    .line 861
    .line 862
    .line 863
    const/4 v1, 0x2

    .line 864
    invoke-static {v0, v1}, Lg0/h0;->s(Landroid/view/View;I)V

    .line 865
    .line 866
    .line 867
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 868
    .line 869
    const/16 v6, 0x1a

    .line 870
    .line 871
    if-lt v1, v6, :cond_15

    .line 872
    .line 873
    if-lt v1, v6, :cond_15

    .line 874
    .line 875
    invoke-static {v0, v4}, Lg0/p0;->l(Landroid/view/View;I)V

    .line 876
    .line 877
    .line 878
    :cond_15
    invoke-virtual {v15, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v15, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v0, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v13}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterEnabled(Z)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0, v12}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperText(Ljava/lang/CharSequence;)V

    .line 900
    .line 901
    .line 902
    return-void
.end method

.method private getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/AutoCompleteTextView;

    .line 4
    .line 5
    if-eqz v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 23
    .line 24
    const v3, 0x7f0400eb

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v3}, Lq6/g;->B(Landroid/view/View;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 32
    .line 33
    sget-object v4, Lcom/google/android/material/textfield/TextInputLayout;->P0:[[I

    .line 34
    .line 35
    const v5, 0x3dcccccd    # 0.1f

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    if-ne v3, v6, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 46
    .line 47
    const v8, 0x7f040114

    .line 48
    .line 49
    .line 50
    const-string v9, "TextInputLayout"

    .line 51
    .line 52
    invoke-static {v3, v9, v8}, Lq6/g;->e0(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    iget v9, v8, Landroid/util/TypedValue;->resourceId:I

    .line 57
    .line 58
    if-eqz v9, :cond_2

    .line 59
    .line 60
    invoke-static {v3, v9}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget v3, v8, Landroid/util/TypedValue;->data:I

    .line 66
    .line 67
    :goto_1
    new-instance v8, Lj6/g;

    .line 68
    .line 69
    iget-object v9, v7, Lj6/g;->a:Lj6/f;

    .line 70
    .line 71
    iget-object v9, v9, Lj6/f;->a:Lj6/k;

    .line 72
    .line 73
    invoke-direct {v8, v9}, Lj6/g;-><init>(Lj6/k;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v5, v0, v3}, Lq6/g;->F(FII)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    filled-new-array {v0, v2}, [I

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v9, Landroid/content/res/ColorStateList;

    .line 85
    .line 86
    invoke-direct {v9, v4, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v9}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v3}, Lj6/g;->setTint(I)V

    .line 93
    .line 94
    .line 95
    filled-new-array {v0, v3}, [I

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    invoke-direct {v3, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lj6/g;

    .line 105
    .line 106
    iget-object v4, v7, Lj6/g;->a:Lj6/f;

    .line 107
    .line 108
    iget-object v4, v4, Lj6/f;->a:Lj6/k;

    .line 109
    .line 110
    invoke-direct {v0, v4}, Lj6/g;-><init>(Lj6/k;)V

    .line 111
    .line 112
    .line 113
    const/4 v4, -0x1

    .line 114
    invoke-virtual {v0, v4}, Lj6/g;->setTint(I)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    .line 118
    .line 119
    invoke-direct {v4, v3, v8, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    new-array v0, v6, [Landroid/graphics/drawable/Drawable;

    .line 123
    .line 124
    aput-object v4, v0, v2

    .line 125
    .line 126
    aput-object v7, v0, v1

    .line 127
    .line 128
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    .line 129
    .line 130
    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_3
    if-ne v3, v1, :cond_4

    .line 135
    .line 136
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 137
    .line 138
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 139
    .line 140
    invoke-static {v5, v0, v2}, Lq6/g;->F(FII)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    filled-new-array {v0, v2}, [I

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 149
    .line 150
    invoke-direct {v2, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    .line 154
    .line 155
    invoke-direct {v0, v2, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_4
    const/4 v0, 0x0

    .line 160
    return-object v0

    .line 161
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 162
    .line 163
    return-object v0
.end method

.method private getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Landroid/graphics/drawable/StateListDrawable;

    .line 11
    .line 12
    const v1, 0x10100aa

    .line 13
    .line 14
    .line 15
    filled-new-array {v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Landroid/graphics/drawable/StateListDrawable;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    new-array v2, v1, [I

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->f(Z)Lj6/g;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Landroid/graphics/drawable/StateListDrawable;

    .line 39
    .line 40
    return-object v0
.end method

.method private getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Lj6/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->f(Z)Lj6/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Lj6/g;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Lj6/g;

    .line 13
    .line 14
    return-object v0
.end method

.method public static k(Landroid/view/ViewGroup;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 13
    .line 14
    .line 15
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-static {v2, p1}, Lcom/google/android/material/textfield/TextInputLayout;->k(Landroid/view/ViewGroup;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method private setEditText(Landroid/widget/EditText;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEndIconMode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    instance-of v0, p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "TextInputLayout"

    .line 17
    .line 18
    const-string v1, "EditText added is not a TextInputEditText. Please switch to using that class instead."

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f:I

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:I

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:I

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 50
    .line 51
    .line 52
    :goto_1
    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Z

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lm6/x;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lm6/x;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setTextInputAccessibilityDelegate(Lm6/x;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Le6/b;->m(Landroid/graphics/Typeface;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iget v3, v2, Le6/b;->h:F

    .line 84
    .line 85
    cmpl-float v3, v3, v1

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iput v1, v2, Le6/b;->h:F

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Le6/b;->h(Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/widget/TextView;->getLetterSpacing()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget v3, v2, Le6/b;->W:F

    .line 101
    .line 102
    cmpl-float v3, v3, v1

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    iput v1, v2, Le6/b;->W:F

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Le6/b;->h(Z)V

    .line 109
    .line 110
    .line 111
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/widget/TextView;->getGravity()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    and-int/lit8 v3, v1, -0x71

    .line 118
    .line 119
    or-int/lit8 v3, v3, 0x30

    .line 120
    .line 121
    iget v4, v2, Le6/b;->g:I

    .line 122
    .line 123
    if-eq v4, v3, :cond_5

    .line 124
    .line 125
    iput v3, v2, Le6/b;->g:I

    .line 126
    .line 127
    invoke-virtual {v2, v0}, Le6/b;->h(Z)V

    .line 128
    .line 129
    .line 130
    :cond_5
    iget v3, v2, Le6/b;->f:I

    .line 131
    .line 132
    if-eq v3, v1, :cond_6

    .line 133
    .line 134
    iput v1, v2, Le6/b;->f:I

    .line 135
    .line 136
    invoke-virtual {v2, v0}, Le6/b;->h(Z)V

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 140
    .line 141
    new-instance v2, Landroidx/appcompat/widget/c3;

    .line 142
    .line 143
    const/4 v3, 0x1

    .line 144
    invoke-direct {v2, p0, v3}, Landroidx/appcompat/widget/c3;-><init>(Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 151
    .line 152
    if-nez v1, :cond_7

    .line 153
    .line 154
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 161
    .line 162
    :cond_7
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 163
    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 167
    .line 168
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_8

    .line 173
    .line 174
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 175
    .line 176
    invoke-virtual {v1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e:Ljava/lang/CharSequence;

    .line 181
    .line 182
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 186
    .line 187
    const/4 v2, 0x0

    .line 188
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    :cond_8
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 192
    .line 193
    :cond_9
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 194
    .line 195
    if-eqz v1, :cond_a

    .line 196
    .line 197
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 198
    .line 199
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 204
    .line 205
    .line 206
    :cond_a
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->q()V

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 210
    .line 211
    invoke-virtual {v1}, Lm6/r;->b()V

    .line 212
    .line 213
    .line 214
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 215
    .line 216
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 217
    .line 218
    .line 219
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 220
    .line 221
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 222
    .line 223
    .line 224
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:Ljava/util/LinkedHashSet;

    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_b

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Lm6/m;

    .line 241
    .line 242
    invoke-virtual {v4, p0}, Lm6/m;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_b
    invoke-virtual {v1}, Lm6/n;->l()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-nez v1, :cond_c

    .line 254
    .line 255
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 256
    .line 257
    .line 258
    :cond_c
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 263
    .line 264
    const-string v0, "We already have an EditText, can only have one"

    .line 265
    .line 266
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw p1
.end method

.method private setHintInternal(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Le6/b;->A:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :cond_0
    iput-object p1, v0, Le6/b;->A:Ljava/lang/CharSequence;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, v0, Le6/b;->B:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v1, v0, Le6/b;->E:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Le6/b;->E:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v0, p1}, Le6/b;->h(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method private setPlaceholderTextEnabled(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 35
    .line 36
    :cond_3
    :goto_0
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 2
    .line 3
    iget v1, v0, Le6/b;->b:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Lt5/a;->b:Lx0/b;

    .line 27
    .line 28
    const v5, 0x7f04031c

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v5, v4}, Lj5/a;->b0(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const v4, 0x7f040312

    .line 45
    .line 46
    .line 47
    const/16 v5, 0xa7

    .line 48
    .line 49
    invoke-static {v3, v4, v5}, Lj5/a;->a0(Landroid/content/Context;II)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-long v3, v3

    .line 54
    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    new-instance v3, Lw5/a;

    .line 60
    .line 61
    invoke-direct {v3, p0, v2}, Lw5/a;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    new-array v3, v3, [F

    .line 71
    .line 72
    iget v0, v0, Le6/b;->b:F

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    aput v0, v3, v4

    .line 76
    .line 77
    aput p1, v3, v2

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    invoke-direct {p2, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    iget v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 11
    .line 12
    and-int/lit8 v0, v0, -0x71

    .line 13
    .line 14
    or-int/lit8 v0, v0, 0x10

    .line 15
    .line 16
    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 27
    .line 28
    .line 29
    check-cast p1, Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEditText(Landroid/widget/EditText;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, v0, Lj6/g;->a:Lj6/f;

    .line 7
    .line 8
    iget-object v1, v1, Lj6/f;->a:Lj6/k;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lj6/g;->setShapeAppearanceModel(Lj6/k;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, -0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    if-ne v0, v1, :cond_3

    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 26
    .line 27
    if-le v0, v2, :cond_2

    .line 28
    .line 29
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    move v0, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v0, v3

    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    move v0, v4

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v0, v3

    .line 41
    :goto_1
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 44
    .line 45
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 46
    .line 47
    int-to-float v1, v1

    .line 48
    iget v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 49
    .line 50
    iget-object v6, v0, Lj6/g;->a:Lj6/f;

    .line 51
    .line 52
    iput v1, v6, Lj6/f;->k:F

    .line 53
    .line 54
    invoke-virtual {v0}, Lj6/g;->invalidateSelf()V

    .line 55
    .line 56
    .line 57
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v5, v0, Lj6/g;->a:Lj6/f;

    .line 62
    .line 63
    iget-object v6, v5, Lj6/f;->d:Landroid/content/res/ColorStateList;

    .line 64
    .line 65
    if-eq v6, v1, :cond_4

    .line 66
    .line 67
    iput-object v1, v5, Lj6/f;->d:Landroid/content/res/ColorStateList;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Lj6/g;->onStateChange([I)Z

    .line 74
    .line 75
    .line 76
    :cond_4
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 77
    .line 78
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 79
    .line 80
    if-ne v1, v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const v1, 0x7f040114

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1, v3}, Lq6/g;->A(Landroid/content/Context;II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 94
    .line 95
    invoke-static {v1, v0}, Lz/a;->b(II)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    :cond_5
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 100
    .line 101
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 102
    .line 103
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v1, v0}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 111
    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 115
    .line 116
    if-nez v1, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 120
    .line 121
    if-le v1, v2, :cond_7

    .line 122
    .line 123
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    move v3, v4

    .line 128
    :cond_7
    if-eqz v3, :cond_9

    .line 129
    .line 130
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 139
    .line 140
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_2

    .line 145
    :cond_8
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 146
    .line 147
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    :goto_2
    invoke-virtual {v0, v1}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 155
    .line 156
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 157
    .line 158
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 163
    .line 164
    .line 165
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 166
    .line 167
    .line 168
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public final c()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    invoke-virtual {v2}, Le6/b;->d()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/high16 v1, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr v0, v1

    .line 24
    :goto_0
    float-to-int v0, v0

    .line 25
    return v0

    .line 26
    :cond_2
    invoke-virtual {v2}, Le6/b;->d()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0
.end method

.method public final d()Lq3/i;
    .locals 4

    .line 1
    new-instance v0, Lq3/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lq3/i;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f040314

    .line 11
    .line 12
    .line 13
    const/16 v3, 0x57

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Lj5/a;->a0(Landroid/content/Context;II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    int-to-long v1, v1

    .line 20
    iput-wide v1, v0, Lq3/s;->c:J

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lt5/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 27
    .line 28
    const v3, 0x7f04031e

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v3, v2}, Lj5/a;->b0(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v0, Lq3/s;->d:Landroid/animation/TimeInterpolator;

    .line 36
    .line 37
    return-object v0
.end method

.method public final dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 15
    .line 16
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->e:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->onProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->setChildCount(I)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ge v2, v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3, p2}, Landroid/view/View;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 89
    .line 90
    if-ne v1, v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getHint()Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v3, v1}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    :goto_1
    return-void
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O0:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O0:Z

    .line 9
    .line 10
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 9
    .line 10
    iget-object v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 11
    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    iget-object v1, v9, Le6/b;->B:Ljava/lang/CharSequence;

    .line 22
    .line 23
    if-eqz v1, :cond_8

    .line 24
    .line 25
    iget-object v1, v9, Le6/b;->e:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    cmpl-float v2, v2, v3

    .line 33
    .line 34
    if-lez v2, :cond_8

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    cmpl-float v1, v1, v3

    .line 41
    .line 42
    if-lez v1, :cond_8

    .line 43
    .line 44
    iget-object v11, v9, Le6/b;->N:Landroid/text/TextPaint;

    .line 45
    .line 46
    iget v1, v9, Le6/b;->G:F

    .line 47
    .line 48
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 49
    .line 50
    .line 51
    iget v1, v9, Le6/b;->p:F

    .line 52
    .line 53
    iget v2, v9, Le6/b;->q:F

    .line 54
    .line 55
    iget v3, v9, Le6/b;->F:F

    .line 56
    .line 57
    const/high16 v4, 0x3f800000    # 1.0f

    .line 58
    .line 59
    cmpl-float v4, v3, v4

    .line 60
    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    invoke-virtual {v8, v3, v3, v1, v2}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 64
    .line 65
    .line 66
    :cond_0
    const/4 v12, 0x0

    .line 67
    iget v3, v9, Le6/b;->d0:I

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    if-le v3, v4, :cond_1

    .line 71
    .line 72
    iget-boolean v3, v9, Le6/b;->C:Z

    .line 73
    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    :cond_1
    move v4, v12

    .line 77
    :cond_2
    if-eqz v4, :cond_7

    .line 78
    .line 79
    iget v1, v9, Le6/b;->p:F

    .line 80
    .line 81
    iget-object v3, v9, Le6/b;->Y:Landroid/text/StaticLayout;

    .line 82
    .line 83
    invoke-virtual {v3, v12}, Landroid/text/StaticLayout;->getLineStart(I)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    int-to-float v3, v3

    .line 88
    sub-float/2addr v1, v3

    .line 89
    invoke-virtual {v11}, Landroid/graphics/Paint;->getAlpha()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    invoke-virtual {v8, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 94
    .line 95
    .line 96
    iget v1, v9, Le6/b;->b0:F

    .line 97
    .line 98
    int-to-float v2, v13

    .line 99
    mul-float/2addr v1, v2

    .line 100
    float-to-int v1, v1

    .line 101
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 102
    .line 103
    .line 104
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    .line 106
    const/16 v15, 0x1f

    .line 107
    .line 108
    if-lt v14, v15, :cond_3

    .line 109
    .line 110
    iget v1, v9, Le6/b;->H:F

    .line 111
    .line 112
    iget v3, v9, Le6/b;->I:F

    .line 113
    .line 114
    iget v4, v9, Le6/b;->J:F

    .line 115
    .line 116
    iget v5, v9, Le6/b;->K:I

    .line 117
    .line 118
    invoke-virtual {v11}, Landroid/graphics/Paint;->getAlpha()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    mul-int/2addr v7, v6

    .line 127
    div-int/lit16 v7, v7, 0xff

    .line 128
    .line 129
    invoke-static {v5, v7}, Lz/a;->c(II)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-virtual {v11, v1, v3, v4, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 134
    .line 135
    .line 136
    :cond_3
    iget-object v1, v9, Le6/b;->Y:Landroid/text/StaticLayout;

    .line 137
    .line 138
    invoke-virtual {v1, v8}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 139
    .line 140
    .line 141
    iget v1, v9, Le6/b;->a0:F

    .line 142
    .line 143
    mul-float/2addr v1, v2

    .line 144
    float-to-int v1, v1

    .line 145
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 146
    .line 147
    .line 148
    if-lt v14, v15, :cond_4

    .line 149
    .line 150
    iget v1, v9, Le6/b;->H:F

    .line 151
    .line 152
    iget v2, v9, Le6/b;->I:F

    .line 153
    .line 154
    iget v3, v9, Le6/b;->J:F

    .line 155
    .line 156
    iget v4, v9, Le6/b;->K:I

    .line 157
    .line 158
    invoke-virtual {v11}, Landroid/graphics/Paint;->getAlpha()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    mul-int/2addr v6, v5

    .line 167
    div-int/lit16 v6, v6, 0xff

    .line 168
    .line 169
    invoke-static {v4, v6}, Lz/a;->c(II)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual {v11, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 174
    .line 175
    .line 176
    :cond_4
    iget-object v1, v9, Le6/b;->Y:Landroid/text/StaticLayout;

    .line 177
    .line 178
    invoke-virtual {v1, v12}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    iget-object v2, v9, Le6/b;->c0:Ljava/lang/CharSequence;

    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    const/4 v5, 0x0

    .line 190
    int-to-float v7, v1

    .line 191
    move-object/from16 v1, p1

    .line 192
    .line 193
    move v6, v7

    .line 194
    move/from16 v16, v7

    .line 195
    .line 196
    move-object v7, v11

    .line 197
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    if-lt v14, v15, :cond_5

    .line 201
    .line 202
    iget v1, v9, Le6/b;->H:F

    .line 203
    .line 204
    iget v2, v9, Le6/b;->I:F

    .line 205
    .line 206
    iget v3, v9, Le6/b;->J:F

    .line 207
    .line 208
    iget v4, v9, Le6/b;->K:I

    .line 209
    .line 210
    invoke-virtual {v11, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 211
    .line 212
    .line 213
    :cond_5
    iget-object v1, v9, Le6/b;->c0:Ljava/lang/CharSequence;

    .line 214
    .line 215
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v2, "\u2026"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_6

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    add-int/lit8 v2, v2, -0x1

    .line 236
    .line 237
    invoke-virtual {v1, v12, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    :cond_6
    move-object v2, v1

    .line 242
    invoke-virtual {v11, v13}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 243
    .line 244
    .line 245
    const/4 v3, 0x0

    .line 246
    iget-object v1, v9, Le6/b;->Y:Landroid/text/StaticLayout;

    .line 247
    .line 248
    invoke-virtual {v1, v12}, Landroid/text/Layout;->getLineEnd(I)I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    const/4 v5, 0x0

    .line 261
    move-object/from16 v1, p1

    .line 262
    .line 263
    move/from16 v6, v16

    .line 264
    .line 265
    move-object v7, v11

    .line 266
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 267
    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_7
    invoke-virtual {v8, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 271
    .line 272
    .line 273
    iget-object v1, v9, Le6/b;->Y:Landroid/text/StaticLayout;

    .line 274
    .line 275
    invoke-virtual {v1, v8}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 276
    .line 277
    .line 278
    :goto_0
    invoke-virtual {v8, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 279
    .line 280
    .line 281
    :cond_8
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 282
    .line 283
    if-eqz v1, :cond_9

    .line 284
    .line 285
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 286
    .line 287
    if-eqz v1, :cond_9

    .line 288
    .line 289
    invoke-virtual {v1, v8}, Lj6/g;->draw(Landroid/graphics/Canvas;)V

    .line 290
    .line 291
    .line 292
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_9

    .line 299
    .line 300
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 301
    .line 302
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iget-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 307
    .line 308
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iget v3, v9, Le6/b;->b:F

    .line 313
    .line 314
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    iget v5, v2, Landroid/graphics/Rect;->left:I

    .line 319
    .line 320
    sget-object v6, Lt5/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 321
    .line 322
    sub-int/2addr v5, v4

    .line 323
    int-to-float v5, v5

    .line 324
    mul-float/2addr v5, v3

    .line 325
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    add-int/2addr v5, v4

    .line 330
    iput v5, v1, Landroid/graphics/Rect;->left:I

    .line 331
    .line 332
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 333
    .line 334
    sub-int/2addr v2, v4

    .line 335
    int-to-float v2, v2

    .line 336
    mul-float/2addr v3, v2

    .line 337
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    add-int/2addr v2, v4

    .line 342
    iput v2, v1, Landroid/graphics/Rect;->right:I

    .line 343
    .line 344
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 345
    .line 346
    invoke-virtual {v1, v8}, Lj6/g;->draw(Landroid/graphics/Canvas;)V

    .line 347
    .line 348
    .line 349
    :cond_9
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Z

    .line 8
    .line 9
    invoke-super {p0}, Landroid/widget/LinearLayout;->drawableStateChanged()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 18
    .line 19
    if-eqz v3, :cond_5

    .line 20
    .line 21
    iput-object v1, v3, Le6/b;->L:[I

    .line 22
    .line 23
    iget-object v1, v3, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    :cond_1
    iget-object v1, v3, Le6/b;->j:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    :cond_2
    move v1, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v1, v2

    .line 46
    :goto_0
    if-eqz v1, :cond_4

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Le6/b;->h(Z)V

    .line 49
    .line 50
    .line 51
    move v1, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move v1, v2

    .line 54
    :goto_1
    or-int/2addr v1, v2

    .line 55
    goto :goto_2

    .line 56
    :cond_5
    move v1, v2

    .line 57
    :goto_2
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 58
    .line 59
    if-eqz v3, :cond_7

    .line 60
    .line 61
    sget-object v3, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 62
    .line 63
    invoke-static {p0}, Lg0/k0;->c(Landroid/view/View;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    move v0, v2

    .line 77
    :goto_3
    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 78
    .line 79
    .line 80
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->q()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 84
    .line 85
    .line 86
    if-eqz v1, :cond_8

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 89
    .line 90
    .line 91
    :cond_8
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Z

    .line 92
    .line 93
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 14
    .line 15
    instance-of v0, v0, Lm6/h;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return v0
.end method

.method public final f(Z)Lj6/g;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0702ef

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move p1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 19
    .line 20
    instance-of v2, v1, Lm6/t;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    check-cast v1, Lm6/t;

    .line 25
    .line 26
    invoke-virtual {v1}, Lm6/t;->getPopupElevation()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v2, 0x7f070166

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    int-to-float v1, v1

    .line 43
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const v3, 0x7f0702b0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    new-instance v3, Lj6/j;

    .line 55
    .line 56
    invoke-direct {v3}, Lj6/j;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lj6/a;

    .line 60
    .line 61
    invoke-direct {v4, p1}, Lj6/a;-><init>(F)V

    .line 62
    .line 63
    .line 64
    iput-object v4, v3, Lj6/j;->e:Lj6/c;

    .line 65
    .line 66
    new-instance v4, Lj6/a;

    .line 67
    .line 68
    invoke-direct {v4, p1}, Lj6/a;-><init>(F)V

    .line 69
    .line 70
    .line 71
    iput-object v4, v3, Lj6/j;->f:Lj6/c;

    .line 72
    .line 73
    new-instance p1, Lj6/a;

    .line 74
    .line 75
    invoke-direct {p1, v0}, Lj6/a;-><init>(F)V

    .line 76
    .line 77
    .line 78
    iput-object p1, v3, Lj6/j;->h:Lj6/c;

    .line 79
    .line 80
    new-instance p1, Lj6/a;

    .line 81
    .line 82
    invoke-direct {p1, v0}, Lj6/a;-><init>(F)V

    .line 83
    .line 84
    .line 85
    iput-object p1, v3, Lj6/j;->g:Lj6/c;

    .line 86
    .line 87
    new-instance p1, Lj6/k;

    .line 88
    .line 89
    invoke-direct {p1, v3}, Lj6/k;-><init>(Lj6/j;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sget-object v3, Lj6/g;->N:Landroid/graphics/Paint;

    .line 97
    .line 98
    const-class v3, Lj6/g;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const v4, 0x7f040114

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v3, v4}, Lq6/g;->e0(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget v4, v3, Landroid/util/TypedValue;->resourceId:I

    .line 112
    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    invoke-static {v0, v4}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    iget v3, v3, Landroid/util/TypedValue;->data:I

    .line 121
    .line 122
    :goto_2
    new-instance v4, Lj6/g;

    .line 123
    .line 124
    invoke-direct {v4}, Lj6/g;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v0}, Lj6/g;->h(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v4, v0}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v1}, Lj6/g;->i(F)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, Lj6/g;->setShapeAppearanceModel(Lj6/k;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, v4, Lj6/g;->a:Lj6/f;

    .line 144
    .line 145
    iget-object v0, p1, Lj6/f;->h:Landroid/graphics/Rect;

    .line 146
    .line 147
    if-nez v0, :cond_3

    .line 148
    .line 149
    new-instance v0, Landroid/graphics/Rect;

    .line 150
    .line 151
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v0, p1, Lj6/f;->h:Landroid/graphics/Rect;

    .line 155
    .line 156
    :cond_3
    iget-object p1, v4, Lj6/g;->a:Lj6/f;

    .line 157
    .line 158
    iget-object p1, p1, Lj6/f;->h:Landroid/graphics/Rect;

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-virtual {p1, v0, v2, v0, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Lj6/g;->invalidateSelf()V

    .line 165
    .line 166
    .line 167
    return-object v4
.end method

.method public final g(IZ)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/2addr v0, p1

    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    sub-int/2addr v0, p1

    .line 25
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    add-int/2addr v0, p1

    .line 34
    :cond_0
    return v0
.end method

.method public getBaseline()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_0
    invoke-super {p0}, Landroid/widget/LinearLayout;->getBaseline()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method public getBoxBackground()Lj6/g;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw v0

    .line 16
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 17
    .line 18
    return-object v0
.end method

.method public getBoxBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxBackgroundMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxCollapsedPaddingTop()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxCornerRadiusBottomEnd()F
    .locals 2

    .line 1
    invoke-static {p0}, Lp7/a0;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 10
    .line 11
    iget-object v0, v0, Lj6/k;->h:Lj6/c;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 19
    .line 20
    iget-object v0, v0, Lj6/k;->g:Lj6/c;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    return v0
.end method

.method public getBoxCornerRadiusBottomStart()F
    .locals 2

    .line 1
    invoke-static {p0}, Lp7/a0;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 10
    .line 11
    iget-object v0, v0, Lj6/k;->g:Lj6/c;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 19
    .line 20
    iget-object v0, v0, Lj6/k;->h:Lj6/c;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    return v0
.end method

.method public getBoxCornerRadiusTopEnd()F
    .locals 2

    .line 1
    invoke-static {p0}, Lp7/a0;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 10
    .line 11
    iget-object v0, v0, Lj6/k;->e:Lj6/c;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 19
    .line 20
    iget-object v0, v0, Lj6/k;->f:Lj6/c;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    return v0
.end method

.method public getBoxCornerRadiusTopStart()F
    .locals 2

    .line 1
    invoke-static {p0}, Lp7/a0;->J(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 10
    .line 11
    iget-object v0, v0, Lj6/k;->f:Lj6/c;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 19
    .line 20
    iget-object v0, v0, Lj6/k;->e:Lj6/c;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    return v0
.end method

.method public getBoxStrokeColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxStrokeErrorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBoxStrokeWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 2
    .line 3
    return v0
.end method

.method public getBoxStrokeWidthFocused()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 2
    .line 3
    return v0
.end method

.method public getCounterMaxLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getCounterOverflowDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public getCounterOverflowTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCounterTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDefaultHintTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEndIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getEndIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getEndIconMinSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget v0, v0, Lm6/n;->D:I

    .line 4
    .line 5
    return v0
.end method

.method public getEndIconMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget v0, v0, Lm6/n;->z:I

    .line 4
    .line 5
    return v0
.end method

.method public getEndIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->E:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    return-object v0
.end method

.method public getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    return-object v0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm6/r;->q:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lm6/r;->p:Ljava/lang/CharSequence;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public getErrorAccessibilityLiveRegion()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget v0, v0, Lm6/r;->t:I

    .line 4
    .line 5
    return v0
.end method

.method public getErrorContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/r;->s:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object v0
.end method

.method public getErrorCurrentTextColors()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    :goto_0
    return v0
.end method

.method public getErrorIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getHelperText()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm6/r;->x:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lm6/r;->w:Ljava/lang/CharSequence;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    return-object v0
.end method

.method public getHelperTextCurrentTextColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    :goto_0
    return v0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return-object v0
.end method

.method public final getHintCollapsedTextHeight()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Le6/b;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getHintCurrentCollapsedTextColor()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 2
    .line 3
    iget-object v1, v0, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le6/b;->e(Landroid/content/res/ColorStateList;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getHintTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLengthCounter()Lm6/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Lm6/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxEms()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinEms()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public getPasswordVisibilityToggleContentDescription()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPasswordVisibilityToggleDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPlaceholderText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:Ljava/lang/CharSequence;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return-object v0
.end method

.method public getPlaceholderTextAppearance()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlaceholderTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPrefixText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->c:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object v0
.end method

.method public getPrefixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->b:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPrefixTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->b:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    return-object v0
.end method

.method public getShapeAppearanceModel()Lj6/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStartIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getStartIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getStartIconMinSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget v0, v0, Lm6/v;->x:I

    .line 4
    .line 5
    return v0
.end method

.method public getStartIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->y:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSuffixText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->G:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSuffixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getSuffixTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    return-object v0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(IZ)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr p1, v0

    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr p2, v0

    .line 33
    add-int/2addr p1, p2

    .line 34
    :cond_0
    return p1
.end method

.method public final i()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-eq v0, v2, :cond_3

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 17
    .line 18
    instance-of v0, v0, Lm6/h;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 23
    .line 24
    sget v4, Lm6/h;->P:I

    .line 25
    .line 26
    new-instance v4, Lm6/f;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lj6/k;

    .line 32
    .line 33
    invoke-direct {v0}, Lj6/k;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    new-instance v5, Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v0, v5}, Lm6/f;-><init>(Lj6/k;Landroid/graphics/RectF;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lm6/g;

    .line 45
    .line 46
    invoke-direct {v0, v4}, Lm6/g;-><init>(Lm6/f;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v0, Lj6/g;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 55
    .line 56
    invoke-direct {v0, v4}, Lj6/g;-><init>(Lj6/k;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 60
    .line 61
    :goto_1
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 62
    .line 63
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v2, " is illegal; only @BoxBackgroundMode constants are supported."

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_3
    new-instance v0, Lj6/g;

    .line 92
    .line 93
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 94
    .line 95
    invoke-direct {v0, v3}, Lj6/g;-><init>(Lj6/k;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 99
    .line 100
    new-instance v0, Lj6/g;

    .line 101
    .line 102
    invoke-direct {v0}, Lj6/g;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 106
    .line 107
    new-instance v0, Lj6/g;

    .line 108
    .line 109
    invoke-direct {v0}, Lj6/g;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 116
    .line 117
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 118
    .line 119
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 120
    .line 121
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    const/high16 v4, 0x40000000    # 2.0f

    .line 131
    .line 132
    if-ne v0, v2, :cond_7

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 147
    .line 148
    cmpl-float v0, v0, v4

    .line 149
    .line 150
    if-ltz v0, :cond_5

    .line 151
    .line 152
    move v0, v2

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move v0, v3

    .line 155
    :goto_3
    if-eqz v0, :cond_6

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const v5, 0x7f070246

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Lp7/a0;->I(Landroid/content/Context;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const v5, 0x7f070245

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 193
    .line 194
    :cond_7
    :goto_4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 195
    .line 196
    if-eqz v0, :cond_b

    .line 197
    .line 198
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 199
    .line 200
    if-eq v0, v2, :cond_8

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 216
    .line 217
    cmpl-float v0, v0, v4

    .line 218
    .line 219
    if-ltz v0, :cond_9

    .line 220
    .line 221
    move v3, v2

    .line 222
    :cond_9
    if-eqz v3, :cond_a

    .line 223
    .line 224
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 225
    .line 226
    sget-object v3, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 227
    .line 228
    invoke-static {v0}, Lg0/i0;->f(Landroid/view/View;)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    const v5, 0x7f070244

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 244
    .line 245
    invoke-static {v5}, Lg0/i0;->e(Landroid/view/View;)I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    const v7, 0x7f070243

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-static {v0, v3, v4, v5, v6}, Lg0/i0;->k(Landroid/view/View;IIII)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, Lp7/a0;->I(Landroid/content/Context;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_b

    .line 273
    .line 274
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 275
    .line 276
    sget-object v3, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 277
    .line 278
    invoke-static {v0}, Lg0/i0;->f(Landroid/view/View;)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    const v5, 0x7f070242

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 294
    .line 295
    invoke-static {v5}, Lg0/i0;->e(Landroid/view/View;)I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    const v7, 0x7f070241

    .line 304
    .line 305
    .line 306
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-static {v0, v3, v4, v5, v6}, Lg0/i0;->k(Landroid/view/View;IIII)V

    .line 311
    .line 312
    .line 313
    :cond_b
    :goto_5
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 314
    .line 315
    if-eqz v0, :cond_c

    .line 316
    .line 317
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 318
    .line 319
    .line 320
    :cond_c
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 321
    .line 322
    instance-of v3, v0, Landroid/widget/AutoCompleteTextView;

    .line 323
    .line 324
    if-nez v3, :cond_d

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_d
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    if-nez v3, :cond_f

    .line 334
    .line 335
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 336
    .line 337
    if-ne v3, v1, :cond_e

    .line 338
    .line 339
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_e
    if-ne v3, v2, :cond_f

    .line 348
    .line 349
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 354
    .line 355
    .line 356
    :cond_f
    :goto_6
    return-void
.end method

.method public final j()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/widget/TextView;->getGravity()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 21
    .line 22
    iget-object v3, v2, Le6/b;->A:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Le6/b;->b(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iput-boolean v3, v2, Le6/b;->C:Z

    .line 29
    .line 30
    const/high16 v4, 0x40000000    # 2.0f

    .line 31
    .line 32
    const/4 v5, 0x5

    .line 33
    const v6, 0x800005

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    const/16 v8, 0x11

    .line 38
    .line 39
    iget-object v9, v2, Le6/b;->d:Landroid/graphics/Rect;

    .line 40
    .line 41
    if-eq v1, v8, :cond_6

    .line 42
    .line 43
    and-int/lit8 v10, v1, 0x7

    .line 44
    .line 45
    if-ne v10, v7, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    and-int v10, v1, v6

    .line 49
    .line 50
    if-eq v10, v6, :cond_4

    .line 51
    .line 52
    and-int/lit8 v10, v1, 0x5

    .line 53
    .line 54
    if-ne v10, v5, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    if-eqz v3, :cond_3

    .line 58
    .line 59
    iget v3, v9, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    iget v10, v2, Le6/b;->Z:F

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    .line 69
    .line 70
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 71
    .line 72
    :goto_1
    int-to-float v3, v3

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    iget v3, v9, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    int-to-float v3, v3

    .line 77
    iget v10, v2, Le6/b;->Z:F

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    :goto_2
    int-to-float v3, v0

    .line 81
    div-float/2addr v3, v4

    .line 82
    iget v10, v2, Le6/b;->Z:F

    .line 83
    .line 84
    div-float/2addr v10, v4

    .line 85
    :goto_3
    sub-float/2addr v3, v10

    .line 86
    :goto_4
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 87
    .line 88
    int-to-float v10, v10

    .line 89
    invoke-static {v3, v10}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iget-object v10, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 94
    .line 95
    iput v3, v10, Landroid/graphics/RectF;->left:F

    .line 96
    .line 97
    iget v11, v9, Landroid/graphics/Rect;->top:I

    .line 98
    .line 99
    int-to-float v11, v11

    .line 100
    iput v11, v10, Landroid/graphics/RectF;->top:F

    .line 101
    .line 102
    if-eq v1, v8, :cond_c

    .line 103
    .line 104
    and-int/lit8 v8, v1, 0x7

    .line 105
    .line 106
    if-ne v8, v7, :cond_7

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_7
    and-int v0, v1, v6

    .line 110
    .line 111
    if-eq v0, v6, :cond_a

    .line 112
    .line 113
    and-int/lit8 v0, v1, 0x5

    .line 114
    .line 115
    if-ne v0, v5, :cond_8

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    iget-boolean v0, v2, Le6/b;->C:Z

    .line 119
    .line 120
    if-eqz v0, :cond_9

    .line 121
    .line 122
    iget v0, v9, Landroid/graphics/Rect;->right:I

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_9
    iget v0, v2, Le6/b;->Z:F

    .line 126
    .line 127
    add-float/2addr v0, v3

    .line 128
    goto :goto_8

    .line 129
    :cond_a
    :goto_5
    iget-boolean v0, v2, Le6/b;->C:Z

    .line 130
    .line 131
    if-eqz v0, :cond_b

    .line 132
    .line 133
    iget v0, v2, Le6/b;->Z:F

    .line 134
    .line 135
    add-float/2addr v0, v3

    .line 136
    goto :goto_8

    .line 137
    :cond_b
    iget v0, v9, Landroid/graphics/Rect;->right:I

    .line 138
    .line 139
    :goto_6
    int-to-float v0, v0

    .line 140
    goto :goto_8

    .line 141
    :cond_c
    :goto_7
    int-to-float v0, v0

    .line 142
    div-float/2addr v0, v4

    .line 143
    iget v1, v2, Le6/b;->Z:F

    .line 144
    .line 145
    div-float/2addr v1, v4

    .line 146
    add-float/2addr v0, v1

    .line 147
    :goto_8
    iget v1, v9, Landroid/graphics/Rect;->right:I

    .line 148
    .line 149
    int-to-float v1, v1

    .line 150
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 155
    .line 156
    iget v0, v9, Landroid/graphics/Rect;->top:I

    .line 157
    .line 158
    int-to-float v0, v0

    .line 159
    invoke-virtual {v2}, Le6/b;->d()F

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    add-float/2addr v1, v0

    .line 164
    iput v1, v10, Landroid/graphics/RectF;->bottom:F

    .line 165
    .line 166
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    const/4 v1, 0x0

    .line 171
    cmpg-float v0, v0, v1

    .line 172
    .line 173
    if-lez v0, :cond_e

    .line 174
    .line 175
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    cmpg-float v0, v0, v1

    .line 180
    .line 181
    if-gtz v0, :cond_d

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_d
    iget v0, v10, Landroid/graphics/RectF;->left:F

    .line 185
    .line 186
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 187
    .line 188
    int-to-float v1, v1

    .line 189
    sub-float/2addr v0, v1

    .line 190
    iput v0, v10, Landroid/graphics/RectF;->left:F

    .line 191
    .line 192
    iget v0, v10, Landroid/graphics/RectF;->right:F

    .line 193
    .line 194
    add-float/2addr v0, v1

    .line 195
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 196
    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    neg-int v0, v0

    .line 202
    int-to-float v0, v0

    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    neg-int v1, v1

    .line 208
    int-to-float v1, v1

    .line 209
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    div-float/2addr v2, v4

    .line 214
    sub-float/2addr v1, v2

    .line 215
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 216
    .line 217
    int-to-float v2, v2

    .line 218
    add-float/2addr v1, v2

    .line 219
    invoke-virtual {v10, v0, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 223
    .line 224
    check-cast v0, Lm6/h;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget v1, v10, Landroid/graphics/RectF;->left:F

    .line 230
    .line 231
    iget v2, v10, Landroid/graphics/RectF;->top:F

    .line 232
    .line 233
    iget v3, v10, Landroid/graphics/RectF;->right:F

    .line 234
    .line 235
    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    .line 236
    .line 237
    invoke-virtual {v0, v1, v2, v3, v4}, Lm6/h;->n(FFFF)V

    .line 238
    .line 239
    .line 240
    :cond_e
    :goto_9
    return-void
.end method

.method public final l(Landroid/widget/TextView;I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const v1, -0xff01

    .line 14
    .line 15
    .line 16
    if-ne p2, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    move v0, p2

    .line 21
    :catch_0
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const p2, 0x7f1301b1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const v0, 0x7f060061

    .line 34
    .line 35
    .line 36
    invoke-static {p2, v0}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final m()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget v1, v0, Lm6/r;->o:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lm6/r;->p:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v2, 0x0

    .line 22
    :goto_0
    return v2
.end method

.method public final n(Landroid/text/Editable;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Lm6/y;

    .line 2
    .line 3
    check-cast v0, Lh3/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v0

    .line 17
    :goto_0
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 18
    .line 19
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-ne v2, v3, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    const/4 v3, 0x1

    .line 44
    if-le p1, v2, :cond_2

    .line 45
    .line 46
    move v2, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v2, v0

    .line 49
    :goto_1
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 56
    .line 57
    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 58
    .line 59
    iget-boolean v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 60
    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    const v7, 0x7f120025

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const v7, 0x7f120024

    .line 68
    .line 69
    .line 70
    :goto_2
    const/4 v8, 0x2

    .line 71
    new-array v9, v8, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    aput-object v10, v9, v0

    .line 78
    .line 79
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    aput-object v6, v9, v3

    .line 84
    .line 85
    invoke-virtual {v2, v7, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v5, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 93
    .line 94
    if-eq v1, v2, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 97
    .line 98
    .line 99
    :cond_4
    sget-object v2, Le0/c;->d:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    sget v5, Le0/n;->a:I

    .line 106
    .line 107
    invoke-static {v2}, Le0/m;->a(Ljava/util/Locale;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ne v2, v3, :cond_5

    .line 112
    .line 113
    move v2, v3

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move v2, v0

    .line 116
    :goto_3
    if-eqz v2, :cond_6

    .line 117
    .line 118
    sget-object v2, Le0/c;->g:Le0/c;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    sget-object v2, Le0/c;->f:Le0/c;

    .line 122
    .line 123
    :goto_4
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    new-array v7, v8, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    aput-object p1, v7, v0

    .line 136
    .line 137
    iget p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 138
    .line 139
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    aput-object p1, v7, v3

    .line 144
    .line 145
    const p1, 0x7f120026

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, p1, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-nez p1, :cond_7

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    iget-object v3, v2, Le0/c;->c:Le0/j;

    .line 159
    .line 160
    invoke-virtual {v2, p1, v3}, Le0/c;->c(Ljava/lang/CharSequence;Le0/j;)Landroid/text/SpannableStringBuilder;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    :goto_5
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 172
    .line 173
    if-eqz p1, :cond_8

    .line 174
    .line 175
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 176
    .line 177
    if-eq v1, p1, :cond_8

    .line 178
    .line 179
    invoke-virtual {p0, v0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->q()V

    .line 186
    .line 187
    .line 188
    :cond_8
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->l(Landroid/widget/TextView;I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Le6/b;->g(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 5
    .line 6
    if-eqz p1, :cond_13

    .line 7
    .line 8
    sget-object p2, Le6/c;->a:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/Rect;

    .line 19
    .line 20
    const/4 p5, 0x0

    .line 21
    invoke-virtual {p4, p5, p5, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 22
    .line 23
    .line 24
    sget-object p2, Le6/c;->a:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Landroid/graphics/Matrix;

    .line 31
    .line 32
    if-nez p3, :cond_0

    .line 33
    .line 34
    new-instance p3, Landroid/graphics/Matrix;

    .line 35
    .line 36
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p3}, Landroid/graphics/Matrix;->reset()V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-static {p0, p1, p3}, Le6/c;->a(Landroid/view/ViewParent;Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Le6/c;->b:Ljava/lang/ThreadLocal;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Landroid/graphics/RectF;

    .line 56
    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    new-instance p2, Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {p2, p4}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 71
    .line 72
    .line 73
    iget p1, p2, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    const/high16 p3, 0x3f000000    # 0.5f

    .line 76
    .line 77
    add-float/2addr p1, p3

    .line 78
    float-to-int p1, p1

    .line 79
    iget v0, p2, Landroid/graphics/RectF;->top:F

    .line 80
    .line 81
    add-float/2addr v0, p3

    .line 82
    float-to-int v0, v0

    .line 83
    iget v1, p2, Landroid/graphics/RectF;->right:F

    .line 84
    .line 85
    add-float/2addr v1, p3

    .line 86
    float-to-int v1, v1

    .line 87
    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    add-float/2addr p2, p3

    .line 90
    float-to-int p2, p2

    .line 91
    invoke-virtual {p4, p1, v0, v1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Lj6/g;

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    iget p2, p4, Landroid/graphics/Rect;->bottom:I

    .line 99
    .line 100
    iget p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 101
    .line 102
    sub-int p3, p2, p3

    .line 103
    .line 104
    iget v0, p4, Landroid/graphics/Rect;->left:I

    .line 105
    .line 106
    iget v1, p4, Landroid/graphics/Rect;->right:I

    .line 107
    .line 108
    invoke-virtual {p1, v0, p3, v1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Lj6/g;

    .line 112
    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    iget p2, p4, Landroid/graphics/Rect;->bottom:I

    .line 116
    .line 117
    iget p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 118
    .line 119
    sub-int p3, p2, p3

    .line 120
    .line 121
    iget v0, p4, Landroid/graphics/Rect;->left:I

    .line 122
    .line 123
    iget v1, p4, Landroid/graphics/Rect;->right:I

    .line 124
    .line 125
    invoke-virtual {p1, v0, p3, v1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 126
    .line 127
    .line 128
    :cond_3
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 129
    .line 130
    if-eqz p1, :cond_13

    .line 131
    .line 132
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 139
    .line 140
    iget p3, p2, Le6/b;->h:F

    .line 141
    .line 142
    cmpl-float p3, p3, p1

    .line 143
    .line 144
    if-eqz p3, :cond_4

    .line 145
    .line 146
    iput p1, p2, Le6/b;->h:F

    .line 147
    .line 148
    invoke-virtual {p2, p5}, Le6/b;->h(Z)V

    .line 149
    .line 150
    .line 151
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/widget/TextView;->getGravity()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    and-int/lit8 p3, p1, -0x71

    .line 158
    .line 159
    or-int/lit8 p3, p3, 0x30

    .line 160
    .line 161
    iget v0, p2, Le6/b;->g:I

    .line 162
    .line 163
    if-eq v0, p3, :cond_5

    .line 164
    .line 165
    iput p3, p2, Le6/b;->g:I

    .line 166
    .line 167
    invoke-virtual {p2, p5}, Le6/b;->h(Z)V

    .line 168
    .line 169
    .line 170
    :cond_5
    iget p3, p2, Le6/b;->f:I

    .line 171
    .line 172
    if-eq p3, p1, :cond_6

    .line 173
    .line 174
    iput p1, p2, Le6/b;->f:I

    .line 175
    .line 176
    invoke-virtual {p2, p5}, Le6/b;->h(Z)V

    .line 177
    .line 178
    .line 179
    :cond_6
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 180
    .line 181
    if-eqz p1, :cond_12

    .line 182
    .line 183
    invoke-static {p0}, Lp7/a0;->J(Landroid/view/View;)Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    iget p3, p4, Landroid/graphics/Rect;->bottom:I

    .line 188
    .line 189
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Rect;

    .line 190
    .line 191
    iput p3, v0, Landroid/graphics/Rect;->bottom:I

    .line 192
    .line 193
    iget p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 194
    .line 195
    const/4 v1, 0x1

    .line 196
    if-eq p3, v1, :cond_8

    .line 197
    .line 198
    const/4 v2, 0x2

    .line 199
    if-eq p3, v2, :cond_7

    .line 200
    .line 201
    iget p3, p4, Landroid/graphics/Rect;->left:I

    .line 202
    .line 203
    invoke-virtual {p0, p3, p1}, Lcom/google/android/material/textfield/TextInputLayout;->g(IZ)I

    .line 204
    .line 205
    .line 206
    move-result p3

    .line 207
    iput p3, v0, Landroid/graphics/Rect;->left:I

    .line 208
    .line 209
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    iput p3, v0, Landroid/graphics/Rect;->top:I

    .line 214
    .line 215
    iget p3, p4, Landroid/graphics/Rect;->right:I

    .line 216
    .line 217
    invoke-virtual {p0, p3, p1}, Lcom/google/android/material/textfield/TextInputLayout;->h(IZ)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_7
    iget p1, p4, Landroid/graphics/Rect;->left:I

    .line 225
    .line 226
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 227
    .line 228
    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    add-int/2addr p3, p1

    .line 233
    iput p3, v0, Landroid/graphics/Rect;->left:I

    .line 234
    .line 235
    iget p1, p4, Landroid/graphics/Rect;->top:I

    .line 236
    .line 237
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 238
    .line 239
    .line 240
    move-result p3

    .line 241
    sub-int/2addr p1, p3

    .line 242
    iput p1, v0, Landroid/graphics/Rect;->top:I

    .line 243
    .line 244
    iget p1, p4, Landroid/graphics/Rect;->right:I

    .line 245
    .line 246
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 247
    .line 248
    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    sub-int/2addr p1, p3

    .line 253
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_8
    iget p3, p4, Landroid/graphics/Rect;->left:I

    .line 257
    .line 258
    invoke-virtual {p0, p3, p1}, Lcom/google/android/material/textfield/TextInputLayout;->g(IZ)I

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    iput p3, v0, Landroid/graphics/Rect;->left:I

    .line 263
    .line 264
    iget p3, p4, Landroid/graphics/Rect;->top:I

    .line 265
    .line 266
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 267
    .line 268
    add-int/2addr p3, v2

    .line 269
    iput p3, v0, Landroid/graphics/Rect;->top:I

    .line 270
    .line 271
    iget p3, p4, Landroid/graphics/Rect;->right:I

    .line 272
    .line 273
    invoke-virtual {p0, p3, p1}, Lcom/google/android/material/textfield/TextInputLayout;->h(IZ)I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 278
    .line 279
    :goto_1
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 280
    .line 281
    iget p3, v0, Landroid/graphics/Rect;->top:I

    .line 282
    .line 283
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 284
    .line 285
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 286
    .line 287
    iget-object v4, p2, Le6/b;->d:Landroid/graphics/Rect;

    .line 288
    .line 289
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 290
    .line 291
    if-ne v5, p1, :cond_9

    .line 292
    .line 293
    iget v5, v4, Landroid/graphics/Rect;->top:I

    .line 294
    .line 295
    if-ne v5, p3, :cond_9

    .line 296
    .line 297
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 298
    .line 299
    if-ne v5, v2, :cond_9

    .line 300
    .line 301
    iget v5, v4, Landroid/graphics/Rect;->bottom:I

    .line 302
    .line 303
    if-ne v5, v3, :cond_9

    .line 304
    .line 305
    move v5, v1

    .line 306
    goto :goto_2

    .line 307
    :cond_9
    move v5, p5

    .line 308
    :goto_2
    if-nez v5, :cond_a

    .line 309
    .line 310
    invoke-virtual {v4, p1, p3, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 311
    .line 312
    .line 313
    iput-boolean v1, p2, Le6/b;->M:Z

    .line 314
    .line 315
    :cond_a
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 316
    .line 317
    if-eqz p1, :cond_11

    .line 318
    .line 319
    iget-object p1, p2, Le6/b;->O:Landroid/text/TextPaint;

    .line 320
    .line 321
    iget p3, p2, Le6/b;->h:F

    .line 322
    .line 323
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 324
    .line 325
    .line 326
    iget-object p3, p2, Le6/b;->u:Landroid/graphics/Typeface;

    .line 327
    .line 328
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 329
    .line 330
    .line 331
    iget p3, p2, Le6/b;->W:F

    .line 332
    .line 333
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Landroid/graphics/Paint;->ascent()F

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    neg-float p1, p1

    .line 341
    iget p3, p4, Landroid/graphics/Rect;->left:I

    .line 342
    .line 343
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 344
    .line 345
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    add-int/2addr v2, p3

    .line 350
    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 351
    .line 352
    iget p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 353
    .line 354
    if-ne p3, v1, :cond_b

    .line 355
    .line 356
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 357
    .line 358
    invoke-virtual {p3}, Landroid/widget/TextView;->getMinLines()I

    .line 359
    .line 360
    .line 361
    move-result p3

    .line 362
    if-gt p3, v1, :cond_b

    .line 363
    .line 364
    move p3, v1

    .line 365
    goto :goto_3

    .line 366
    :cond_b
    move p3, p5

    .line 367
    :goto_3
    if-eqz p3, :cond_c

    .line 368
    .line 369
    invoke-virtual {p4}, Landroid/graphics/Rect;->centerY()I

    .line 370
    .line 371
    .line 372
    move-result p3

    .line 373
    int-to-float p3, p3

    .line 374
    const/high16 v2, 0x40000000    # 2.0f

    .line 375
    .line 376
    div-float v2, p1, v2

    .line 377
    .line 378
    sub-float/2addr p3, v2

    .line 379
    float-to-int p3, p3

    .line 380
    goto :goto_4

    .line 381
    :cond_c
    iget p3, p4, Landroid/graphics/Rect;->top:I

    .line 382
    .line 383
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 384
    .line 385
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    add-int/2addr p3, v2

    .line 390
    :goto_4
    iput p3, v0, Landroid/graphics/Rect;->top:I

    .line 391
    .line 392
    iget p3, p4, Landroid/graphics/Rect;->right:I

    .line 393
    .line 394
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 395
    .line 396
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    sub-int/2addr p3, v2

    .line 401
    iput p3, v0, Landroid/graphics/Rect;->right:I

    .line 402
    .line 403
    iget p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 404
    .line 405
    if-ne p3, v1, :cond_d

    .line 406
    .line 407
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 408
    .line 409
    invoke-virtual {p3}, Landroid/widget/TextView;->getMinLines()I

    .line 410
    .line 411
    .line 412
    move-result p3

    .line 413
    if-gt p3, v1, :cond_d

    .line 414
    .line 415
    move p3, v1

    .line 416
    goto :goto_5

    .line 417
    :cond_d
    move p3, p5

    .line 418
    :goto_5
    if-eqz p3, :cond_e

    .line 419
    .line 420
    iget p3, v0, Landroid/graphics/Rect;->top:I

    .line 421
    .line 422
    int-to-float p3, p3

    .line 423
    add-float/2addr p3, p1

    .line 424
    float-to-int p1, p3

    .line 425
    goto :goto_6

    .line 426
    :cond_e
    iget p1, p4, Landroid/graphics/Rect;->bottom:I

    .line 427
    .line 428
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 429
    .line 430
    invoke-virtual {p3}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 431
    .line 432
    .line 433
    move-result p3

    .line 434
    sub-int/2addr p1, p3

    .line 435
    :goto_6
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 436
    .line 437
    iget p3, v0, Landroid/graphics/Rect;->left:I

    .line 438
    .line 439
    iget p4, v0, Landroid/graphics/Rect;->top:I

    .line 440
    .line 441
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 442
    .line 443
    iget-object v2, p2, Le6/b;->c:Landroid/graphics/Rect;

    .line 444
    .line 445
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 446
    .line 447
    if-ne v3, p3, :cond_f

    .line 448
    .line 449
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 450
    .line 451
    if-ne v3, p4, :cond_f

    .line 452
    .line 453
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 454
    .line 455
    if-ne v3, v0, :cond_f

    .line 456
    .line 457
    iget v3, v2, Landroid/graphics/Rect;->bottom:I

    .line 458
    .line 459
    if-ne v3, p1, :cond_f

    .line 460
    .line 461
    move v3, v1

    .line 462
    goto :goto_7

    .line 463
    :cond_f
    move v3, p5

    .line 464
    :goto_7
    if-nez v3, :cond_10

    .line 465
    .line 466
    invoke-virtual {v2, p3, p4, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 467
    .line 468
    .line 469
    iput-boolean v1, p2, Le6/b;->M:Z

    .line 470
    .line 471
    :cond_10
    invoke-virtual {p2, p5}, Le6/b;->h(Z)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    if-eqz p1, :cond_13

    .line 479
    .line 480
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 481
    .line 482
    if-nez p1, :cond_13

    .line 483
    .line 484
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 485
    .line 486
    .line 487
    goto :goto_8

    .line 488
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 489
    .line 490
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 491
    .line 492
    .line 493
    throw p1

    .line 494
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 495
    .line 496
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 497
    .line 498
    .line 499
    throw p1

    .line 500
    :cond_13
    :goto_8
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v1, p1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 37
    .line 38
    .line 39
    move p1, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 42
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 51
    .line 52
    new-instance v1, Lm6/w;

    .line 53
    .line 54
    invoke-direct {v1, p0, p2}, Lm6/w;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/widget/TextView;->getGravity()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 78
    .line 79
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 80
    .line 81
    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v0}, Lm6/n;->l()V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lm6/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lm6/z;

    .line 10
    .line 11
    iget-object v0, p1, Ln0/b;->a:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lm6/z;->c:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p1, p1, Lm6/z;->d:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p1, Lm6/w;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p1, p0, v0}, Lm6/w;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRtlPropertiesChanged(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Z

    .line 10
    .line 11
    if-eq v0, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 14
    .line 15
    iget-object p1, p1, Lj6/k;->e:Lj6/c;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-interface {p1, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 24
    .line 25
    iget-object v2, v2, Lj6/k;->f:Lj6/c;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 32
    .line 33
    iget-object v3, v3, Lj6/k;->h:Lj6/c;

    .line 34
    .line 35
    invoke-interface {v3, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 40
    .line 41
    iget-object v4, v4, Lj6/k;->g:Lj6/c;

    .line 42
    .line 43
    invoke-interface {v4, v1}, Lj6/c;->a(Landroid/graphics/RectF;)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 48
    .line 49
    iget-object v5, v4, Lj6/k;->a:Lr6/h0;

    .line 50
    .line 51
    new-instance v6, Lj6/j;

    .line 52
    .line 53
    invoke-direct {v6}, Lj6/j;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v7, v4, Lj6/k;->b:Lr6/h0;

    .line 57
    .line 58
    iput-object v7, v6, Lj6/j;->a:Lr6/h0;

    .line 59
    .line 60
    invoke-static {v7}, Lj6/j;->b(Lr6/h0;)V

    .line 61
    .line 62
    .line 63
    iput-object v5, v6, Lj6/j;->b:Lr6/h0;

    .line 64
    .line 65
    invoke-static {v5}, Lj6/j;->b(Lr6/h0;)V

    .line 66
    .line 67
    .line 68
    iget-object v5, v4, Lj6/k;->c:Lr6/h0;

    .line 69
    .line 70
    iput-object v5, v6, Lj6/j;->d:Lr6/h0;

    .line 71
    .line 72
    invoke-static {v5}, Lj6/j;->b(Lr6/h0;)V

    .line 73
    .line 74
    .line 75
    iget-object v4, v4, Lj6/k;->d:Lr6/h0;

    .line 76
    .line 77
    iput-object v4, v6, Lj6/j;->c:Lr6/h0;

    .line 78
    .line 79
    invoke-static {v4}, Lj6/j;->b(Lr6/h0;)V

    .line 80
    .line 81
    .line 82
    new-instance v4, Lj6/a;

    .line 83
    .line 84
    invoke-direct {v4, v2}, Lj6/a;-><init>(F)V

    .line 85
    .line 86
    .line 87
    iput-object v4, v6, Lj6/j;->e:Lj6/c;

    .line 88
    .line 89
    new-instance v2, Lj6/a;

    .line 90
    .line 91
    invoke-direct {v2, p1}, Lj6/a;-><init>(F)V

    .line 92
    .line 93
    .line 94
    iput-object v2, v6, Lj6/j;->f:Lj6/c;

    .line 95
    .line 96
    new-instance p1, Lj6/a;

    .line 97
    .line 98
    invoke-direct {p1, v1}, Lj6/a;-><init>(F)V

    .line 99
    .line 100
    .line 101
    iput-object p1, v6, Lj6/j;->h:Lj6/c;

    .line 102
    .line 103
    new-instance p1, Lj6/a;

    .line 104
    .line 105
    invoke-direct {p1, v3}, Lj6/a;-><init>(F)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v6, Lj6/j;->g:Lj6/c;

    .line 109
    .line 110
    new-instance p1, Lj6/k;

    .line 111
    .line 112
    invoke-direct {p1, v6}, Lj6/k;-><init>(Lj6/j;)V

    .line 113
    .line 114
    .line 115
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Z

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setShapeAppearanceModel(Lj6/k;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lm6/z;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lm6/z;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, v1, Lm6/z;->c:Ljava/lang/CharSequence;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 23
    .line 24
    iget v2, v0, Lm6/n;->z:I

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v4

    .line 33
    :goto_0
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v3, v4

    .line 45
    :goto_1
    iput-boolean v3, v1, Lm6/z;->d:Z

    .line 46
    .line 47
    return-object v1
.end method

.method public final p()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getStartIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x1

    .line 12
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-lez v0, :cond_2

    .line 37
    .line 38
    move v0, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v0, v1

    .line 41
    :goto_0
    const/4 v4, 0x2

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x3

    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sub-int/2addr v0, v3

    .line 57
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Landroid/graphics/drawable/ColorDrawable;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    .line 62
    .line 63
    if-eq v3, v0, :cond_4

    .line 64
    .line 65
    :cond_3
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 66
    .line 67
    invoke-direct {v3}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Landroid/graphics/drawable/ColorDrawable;

    .line 71
    .line 72
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    .line 73
    .line 74
    invoke-virtual {v3, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 78
    .line 79
    invoke-static {v0}, Lk0/p;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    aget-object v3, v0, v1

    .line 84
    .line 85
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Landroid/graphics/drawable/ColorDrawable;

    .line 86
    .line 87
    if-eq v3, v7, :cond_6

    .line 88
    .line 89
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 90
    .line 91
    aget-object v8, v0, v2

    .line 92
    .line 93
    aget-object v9, v0, v4

    .line 94
    .line 95
    aget-object v0, v0, v6

    .line 96
    .line 97
    invoke-static {v3, v7, v8, v9, v0}, Lk0/p;->e(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Landroid/graphics/drawable/ColorDrawable;

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 106
    .line 107
    invoke-static {v0}, Lk0/p;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 112
    .line 113
    aget-object v7, v0, v2

    .line 114
    .line 115
    aget-object v8, v0, v4

    .line 116
    .line 117
    aget-object v0, v0, v6

    .line 118
    .line 119
    invoke-static {v3, v5, v7, v8, v0}, Lk0/p;->e(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    iput-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Landroid/graphics/drawable/ColorDrawable;

    .line 123
    .line 124
    :goto_1
    move v0, v2

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move v0, v1

    .line 127
    :goto_2
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 128
    .line 129
    invoke-virtual {v3}, Lm6/n;->d()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-nez v7, :cond_9

    .line 134
    .line 135
    iget v7, v3, Lm6/n;->z:I

    .line 136
    .line 137
    if-eqz v7, :cond_7

    .line 138
    .line 139
    move v7, v2

    .line 140
    goto :goto_3

    .line 141
    :cond_7
    move v7, v1

    .line 142
    :goto_3
    if-eqz v7, :cond_8

    .line 143
    .line 144
    invoke-virtual {v3}, Lm6/n;->c()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_9

    .line 149
    .line 150
    :cond_8
    iget-object v7, v3, Lm6/n;->G:Ljava/lang/CharSequence;

    .line 151
    .line 152
    if-eqz v7, :cond_a

    .line 153
    .line 154
    :cond_9
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-lez v7, :cond_a

    .line 159
    .line 160
    move v7, v2

    .line 161
    goto :goto_4

    .line 162
    :cond_a
    move v7, v1

    .line 163
    :goto_4
    if-eqz v7, :cond_12

    .line 164
    .line 165
    iget-object v7, v3, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 166
    .line 167
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    iget-object v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 172
    .line 173
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    sub-int/2addr v7, v8

    .line 178
    invoke-virtual {v3}, Lm6/n;->d()Z

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    if-eqz v8, :cond_b

    .line 183
    .line 184
    iget-object v5, v3, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_b
    iget v8, v3, Lm6/n;->z:I

    .line 188
    .line 189
    if-eqz v8, :cond_c

    .line 190
    .line 191
    move v8, v2

    .line 192
    goto :goto_5

    .line 193
    :cond_c
    move v8, v1

    .line 194
    :goto_5
    if-eqz v8, :cond_d

    .line 195
    .line 196
    invoke-virtual {v3}, Lm6/n;->c()Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-eqz v8, :cond_d

    .line 201
    .line 202
    iget-object v5, v3, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 203
    .line 204
    :cond_d
    :goto_6
    if-eqz v5, :cond_e

    .line 205
    .line 206
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    add-int/2addr v3, v7

    .line 211
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 216
    .line 217
    invoke-static {v5}, Lg0/m;->c(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    add-int v7, v5, v3

    .line 222
    .line 223
    :cond_e
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 224
    .line 225
    invoke-static {v3}, Lk0/p;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 230
    .line 231
    if-eqz v5, :cond_f

    .line 232
    .line 233
    iget v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    .line 234
    .line 235
    if-eq v8, v7, :cond_f

    .line 236
    .line 237
    iput v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    .line 238
    .line 239
    invoke-virtual {v5, v1, v1, v7, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 240
    .line 241
    .line 242
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 243
    .line 244
    aget-object v1, v3, v1

    .line 245
    .line 246
    aget-object v4, v3, v2

    .line 247
    .line 248
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 249
    .line 250
    aget-object v3, v3, v6

    .line 251
    .line 252
    invoke-static {v0, v1, v4, v5, v3}, Lk0/p;->e(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_f
    if-nez v5, :cond_10

    .line 257
    .line 258
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 259
    .line 260
    invoke-direct {v5}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 261
    .line 262
    .line 263
    iput-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 264
    .line 265
    iput v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    .line 266
    .line 267
    invoke-virtual {v5, v1, v1, v7, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 268
    .line 269
    .line 270
    :cond_10
    aget-object v4, v3, v4

    .line 271
    .line 272
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 273
    .line 274
    if-eq v4, v5, :cond_11

    .line 275
    .line 276
    iput-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/graphics/drawable/Drawable;

    .line 277
    .line 278
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 279
    .line 280
    aget-object v1, v3, v1

    .line 281
    .line 282
    aget-object v4, v3, v2

    .line 283
    .line 284
    aget-object v3, v3, v6

    .line 285
    .line 286
    invoke-static {v0, v1, v4, v5, v3}, Lk0/p;->e(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_11
    move v2, v0

    .line 291
    goto :goto_8

    .line 292
    :cond_12
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 293
    .line 294
    if-eqz v3, :cond_14

    .line 295
    .line 296
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 297
    .line 298
    invoke-static {v3}, Lk0/p;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    aget-object v4, v3, v4

    .line 303
    .line 304
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 305
    .line 306
    if-ne v4, v7, :cond_13

    .line 307
    .line 308
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 309
    .line 310
    aget-object v1, v3, v1

    .line 311
    .line 312
    aget-object v4, v3, v2

    .line 313
    .line 314
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/graphics/drawable/Drawable;

    .line 315
    .line 316
    aget-object v3, v3, v6

    .line 317
    .line 318
    invoke-static {v0, v1, v4, v7, v3}, Lk0/p;->e(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_13
    move v2, v0

    .line 323
    :goto_7
    iput-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/ColorDrawable;

    .line 324
    .line 325
    :goto_8
    move v0, v2

    .line 326
    :cond_14
    return v0
.end method

.method public final q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    sget-object v1, Landroidx/appcompat/widget/v1;->a:[I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 34
    .line 35
    sget-object v3, Landroidx/appcompat/widget/x;->b:Landroid/graphics/PorterDuff$Mode;

    .line 36
    .line 37
    const-class v3, Landroidx/appcompat/widget/x;

    .line 38
    .line 39
    monitor-enter v3

    .line 40
    :try_start_0
    invoke-static {v1, v2}, Landroidx/appcompat/widget/y2;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit v3

    .line 45
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    monitor-exit v3

    .line 51
    throw v0

    .line 52
    :cond_2
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 65
    .line 66
    invoke-static {v1, v2}, Landroidx/appcompat/widget/x;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/View;->refreshDrawableState()V

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_0
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lg0/h0;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Z

    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 19
    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public setBoxBackgroundColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setBoxBackgroundColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lx/j;->getColor(Landroid/content/Context;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBoxBackgroundColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 8
    .line 9
    const v0, -0x101009e

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 22
    .line 23
    const v0, 0x101009c

    .line 24
    .line 25
    .line 26
    const v2, 0x101009e

    .line 27
    .line 28
    .line 29
    filled-new-array {v0, v2}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 38
    .line 39
    const v0, 0x1010367

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, v2}, [I

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setBoxBackgroundMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public setBoxCollapsedPaddingTop(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 2
    .line 3
    return-void
.end method

.method public setBoxCornerFamily(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lj6/j;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lj6/j;-><init>(Lj6/k;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 12
    .line 13
    iget-object v0, v0, Lj6/k;->e:Lj6/c;

    .line 14
    .line 15
    invoke-static {p1}, Lp7/a0;->m(I)Lr6/h0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iput-object v2, v1, Lj6/j;->a:Lr6/h0;

    .line 20
    .line 21
    invoke-static {v2}, Lj6/j;->b(Lr6/h0;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, v1, Lj6/j;->e:Lj6/c;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 27
    .line 28
    iget-object v0, v0, Lj6/k;->f:Lj6/c;

    .line 29
    .line 30
    invoke-static {p1}, Lp7/a0;->m(I)Lr6/h0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v1, Lj6/j;->b:Lr6/h0;

    .line 35
    .line 36
    invoke-static {v2}, Lj6/j;->b(Lr6/h0;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, v1, Lj6/j;->f:Lj6/c;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 42
    .line 43
    iget-object v0, v0, Lj6/k;->h:Lj6/c;

    .line 44
    .line 45
    invoke-static {p1}, Lp7/a0;->m(I)Lr6/h0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, v1, Lj6/j;->d:Lr6/h0;

    .line 50
    .line 51
    invoke-static {v2}, Lj6/j;->b(Lr6/h0;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, v1, Lj6/j;->h:Lj6/c;

    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 57
    .line 58
    iget-object v0, v0, Lj6/k;->g:Lj6/c;

    .line 59
    .line 60
    invoke-static {p1}, Lp7/a0;->m(I)Lr6/h0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, v1, Lj6/j;->c:Lr6/h0;

    .line 65
    .line 66
    invoke-static {p1}, Lj6/j;->b(Lr6/h0;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, v1, Lj6/j;->g:Lj6/c;

    .line 70
    .line 71
    new-instance p1, Lj6/k;

    .line 72
    .line 73
    invoke-direct {p1, v1}, Lj6/k;-><init>(Lj6/j;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public setBoxStrokeColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 12
    .line 13
    const v0, -0x101009e

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:I

    .line 26
    .line 27
    const v0, 0x1010367

    .line 28
    .line 29
    .line 30
    const v2, 0x101009e

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v2}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:I

    .line 42
    .line 43
    const v0, 0x101009c

    .line 44
    .line 45
    .line 46
    filled-new-array {v0, v2}, [I

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v0, v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBoxStrokeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBoxStrokeWidthFocused(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBoxStrokeWidthFocusedResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidthFocused(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBoxStrokeWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidth(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCounterEnabled(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x2

    .line 7
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    new-instance v3, Landroidx/appcompat/widget/i1;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-direct {v3, v4, v0}, Landroidx/appcompat/widget/i1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    .line 19
    .line 20
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 21
    .line 22
    const v4, 0x7f0a01e9

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:Landroid/graphics/Typeface;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 44
    .line 45
    invoke-virtual {v2, v3, v1}, Lm6/r;->a(Landroid/widget/TextView;I)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const v3, 0x7f07030a

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v1, v2}, Lg0/m;->h(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 91
    .line 92
    invoke-virtual {v2, v3, v1}, Lm6/r;->g(Landroid/widget/TextView;I)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 96
    .line 97
    :cond_3
    :goto_1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Z

    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public setCounterMaxLength(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 12
    .line 13
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Z

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public setCounterOverflowTextAppearance(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterTextAppearance(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->k(Landroid/view/ViewGroup;Z)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setEndIconActivated(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setActivated(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEndIconCheckable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEndIconContentDescription(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setEndIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setEndIconDrawable(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v1, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 5
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    iget-object v2, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    iget-object v3, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v3, v1, p1, v2}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 7
    iget-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    invoke-static {v3, v1, p1}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 8
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    iget-object v1, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 9
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    .line 10
    iget-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    iget-object v2, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    iget-object v3, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v3, v1, p1, v2}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 11
    iget-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    invoke-static {v3, v1, p1}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setEndIconMinSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget v1, v0, Lm6/n;->D:I

    .line 6
    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Lm6/n;->D:I

    .line 10
    .line 11
    iget-object v1, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v0, "endIconSize cannot be less than 0"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public setEndIconMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm6/n;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->F:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setEndIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/n;->F:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setEndIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/n;->E:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    iget-object v1, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setEndIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, p1, v1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setEndIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, v1, p1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setEndIconVisible(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm6/n;->g(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm6/r;->q:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Lm6/r;->c()V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, Lm6/r;->p:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget v1, v0, Lm6/r;->n:I

    .line 35
    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    .line 38
    iput v2, v0, Lm6/r;->o:I

    .line 39
    .line 40
    :cond_2
    iget v2, v0, Lm6/r;->o:I

    .line 41
    .line 42
    iget-object v3, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 43
    .line 44
    invoke-virtual {v0, v3, p1}, Lm6/r;->h(Landroid/widget/TextView;Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0, v1, v2, p1}, Lm6/r;->i(IIZ)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {v0}, Lm6/r;->f()V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void
.end method

.method public setErrorAccessibilityLiveRegion(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput p1, v0, Lm6/r;->t:I

    .line 4
    .line 5
    iget-object v0, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lg0/k0;->f(Landroid/view/View;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setErrorContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/r;->s:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setErrorEnabled(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm6/r;->q:Z

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lm6/r;->c()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lm6/r;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz p1, :cond_6

    .line 17
    .line 18
    new-instance v4, Landroidx/appcompat/widget/i1;

    .line 19
    .line 20
    iget-object v5, v0, Lm6/r;->g:Landroid/content/Context;

    .line 21
    .line 22
    invoke-direct {v4, v5, v2}, Landroidx/appcompat/widget/i1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    .line 24
    .line 25
    iput-object v4, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 26
    .line 27
    const v2, 0x7f0a01ea

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2}, Landroid/view/View;->setId(I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 34
    .line 35
    const/4 v4, 0x5

    .line 36
    invoke-virtual {v2, v4}, Landroid/view/View;->setTextAlignment(I)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Lm6/r;->B:Landroid/graphics/Typeface;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iget-object v4, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget v2, v0, Lm6/r;->u:I

    .line 49
    .line 50
    iput v2, v0, Lm6/r;->u:I

    .line 51
    .line 52
    iget-object v4, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1, v4, v2}, Lcom/google/android/material/textfield/TextInputLayout;->l(Landroid/widget/TextView;I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v1, v0, Lm6/r;->v:Landroid/content/res/ColorStateList;

    .line 60
    .line 61
    iput-object v1, v0, Lm6/r;->v:Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    iget-object v2, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v1, v0, Lm6/r;->s:Ljava/lang/CharSequence;

    .line 73
    .line 74
    iput-object v1, v0, Lm6/r;->s:Ljava/lang/CharSequence;

    .line 75
    .line 76
    iget-object v2, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget v1, v0, Lm6/r;->t:I

    .line 84
    .line 85
    iput v1, v0, Lm6/r;->t:I

    .line 86
    .line 87
    iget-object v2, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 88
    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    sget-object v4, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 92
    .line 93
    invoke-static {v2, v1}, Lg0/k0;->f(Landroid/view/View;I)V

    .line 94
    .line 95
    .line 96
    :cond_5
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 97
    .line 98
    const/4 v2, 0x4

    .line 99
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 103
    .line 104
    invoke-virtual {v0, v1, v3}, Lm6/r;->a(Landroid/widget/TextView;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    invoke-virtual {v0}, Lm6/r;->f()V

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 112
    .line 113
    invoke-virtual {v0, v4, v3}, Lm6/r;->g(Landroid/widget/TextView;I)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->q()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 122
    .line 123
    .line 124
    :goto_0
    iput-boolean p1, v0, Lm6/r;->q:Z

    .line 125
    .line 126
    :goto_1
    return-void
.end method

.method public setErrorIconDrawable(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0, p1}, Lm6/n;->h(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object p1, v0, Lm6/n;->d:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v1, v0, p1}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    invoke-virtual {v0, p1}, Lm6/n;->h(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setErrorIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/n;->f:Landroid/view/View$OnLongClickListener;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setErrorIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/n;->f:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setErrorIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->d:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/n;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/n;->e:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, p1, v1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setErrorIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/n;->e:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/n;->e:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/n;->d:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, v1, p1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setErrorTextAppearance(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput p1, v0, Lm6/r;->u:I

    .line 4
    .line 5
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lm6/r;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->l(Landroid/widget/TextView;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setErrorTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/r;->v:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setExpandedHintEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setHelperText(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean p1, v1, Lm6/r;->x:Z

    .line 10
    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-boolean v0, v1, Lm6/r;->x:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {v1}, Lm6/r;->c()V

    .line 27
    .line 28
    .line 29
    iput-object p1, v1, Lm6/r;->w:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iget-object v0, v1, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget v0, v1, Lm6/r;->n:I

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    if-eq v0, v2, :cond_2

    .line 40
    .line 41
    iput v2, v1, Lm6/r;->o:I

    .line 42
    .line 43
    :cond_2
    iget v2, v1, Lm6/r;->o:I

    .line 44
    .line 45
    iget-object v3, v1, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 46
    .line 47
    invoke-virtual {v1, v3, p1}, Lm6/r;->h(Landroid/widget/TextView;Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v1, v0, v2, p1}, Lm6/r;->i(IIZ)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public setHelperTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/r;->A:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setHelperTextEnabled(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iget-boolean v1, v0, Lm6/r;->x:Z

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Lm6/r;->c()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz p1, :cond_4

    .line 15
    .line 16
    new-instance v3, Landroidx/appcompat/widget/i1;

    .line 17
    .line 18
    iget-object v4, v0, Lm6/r;->g:Landroid/content/Context;

    .line 19
    .line 20
    invoke-direct {v3, v4, v1}, Landroidx/appcompat/widget/i1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    .line 22
    .line 23
    iput-object v3, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 24
    .line 25
    const v1, 0x7f0a01eb

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v1}, Landroid/view/View;->setId(I)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    invoke-virtual {v1, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lm6/r;->B:Landroid/graphics/Typeface;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v3, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 47
    .line 48
    const/4 v3, 0x4

    .line 49
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 53
    .line 54
    invoke-static {v1, v2}, Lg0/k0;->f(Landroid/view/View;I)V

    .line 55
    .line 56
    .line 57
    iget v1, v0, Lm6/r;->z:I

    .line 58
    .line 59
    iput v1, v0, Lm6/r;->z:I

    .line 60
    .line 61
    iget-object v3, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object v1, v0, Lm6/r;->A:Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    iput-object v1, v0, Lm6/r;->A:Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    iget-object v3, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Lm6/r;->a(Landroid/widget/TextView;I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 87
    .line 88
    new-instance v2, Lm6/q;

    .line 89
    .line 90
    invoke-direct {v2, v0}, Lm6/q;-><init>(Lm6/r;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-virtual {v0}, Lm6/r;->c()V

    .line 98
    .line 99
    .line 100
    iget v3, v0, Lm6/r;->n:I

    .line 101
    .line 102
    const/4 v4, 0x2

    .line 103
    if-ne v3, v4, :cond_5

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    iput v4, v0, Lm6/r;->o:I

    .line 107
    .line 108
    :cond_5
    iget v4, v0, Lm6/r;->o:I

    .line 109
    .line 110
    iget-object v5, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 111
    .line 112
    const-string v6, ""

    .line 113
    .line 114
    invoke-virtual {v0, v5, v6}, Lm6/r;->h(Landroid/widget/TextView;Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v0, v3, v4, v5}, Lm6/r;->i(IIZ)V

    .line 119
    .line 120
    .line 121
    iget-object v3, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 122
    .line 123
    invoke-virtual {v0, v3, v2}, Lm6/r;->g(Landroid/widget/TextView;I)V

    .line 124
    .line 125
    .line 126
    iput-object v1, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 127
    .line 128
    iget-object v1, v0, Lm6/r;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->q()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    .line 134
    .line 135
    .line 136
    :goto_0
    iput-boolean p1, v0, Lm6/r;->x:Z

    .line 137
    .line 138
    :goto_1
    return-void
.end method

.method public setHelperTextTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 2
    .line 3
    iput p1, v0, Lm6/r;->z:I

    .line 4
    .line 5
    iget-object v0, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setHint(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    const/16 p1, 0x800

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
    return-void
.end method

.method public setHintAnimationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHintEnabled(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ljava/lang/CharSequence;

    .line 57
    .line 58
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Z

    .line 74
    .line 75
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method public setHintTextAppearance(I)V
    .locals 5

    .line 1
    new-instance v0, Lg6/d;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 4
    .line 5
    iget-object v2, v1, Le6/b;->a:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v0, v3, p1}, Lg6/d;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lg6/d;->j:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iput-object p1, v1, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 19
    .line 20
    :cond_0
    iget p1, v0, Lg6/d;->k:F

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    cmpl-float v3, p1, v3

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iput p1, v1, Le6/b;->i:F

    .line 28
    .line 29
    :cond_1
    iget-object p1, v0, Lg6/d;->a:Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iput-object p1, v1, Le6/b;->U:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    :cond_2
    iget p1, v0, Lg6/d;->e:F

    .line 36
    .line 37
    iput p1, v1, Le6/b;->S:F

    .line 38
    .line 39
    iget p1, v0, Lg6/d;->f:F

    .line 40
    .line 41
    iput p1, v1, Le6/b;->T:F

    .line 42
    .line 43
    iget p1, v0, Lg6/d;->g:F

    .line 44
    .line 45
    iput p1, v1, Le6/b;->R:F

    .line 46
    .line 47
    iget p1, v0, Lg6/d;->i:F

    .line 48
    .line 49
    iput p1, v1, Le6/b;->V:F

    .line 50
    .line 51
    iget-object p1, v1, Le6/b;->y:Lg6/a;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    iput-boolean v3, p1, Lg6/a;->w:Z

    .line 57
    .line 58
    :cond_3
    new-instance p1, Lg6/a;

    .line 59
    .line 60
    new-instance v3, Lk3/d;

    .line 61
    .line 62
    const/16 v4, 0x17

    .line 63
    .line 64
    invoke-direct {v3, v1, v4}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lg6/d;->a()V

    .line 68
    .line 69
    .line 70
    iget-object v4, v0, Lg6/d;->n:Landroid/graphics/Typeface;

    .line 71
    .line 72
    invoke-direct {p1, v3, v4}, Lg6/a;-><init>(Lk3/d;Landroid/graphics/Typeface;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, v1, Le6/b;->y:Lg6/a;

    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, v1, Le6/b;->y:Lg6/a;

    .line 82
    .line 83
    invoke-virtual {v0, p1, v2}, Lg6/d;->c(Landroid/content/Context;Lw7/b;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-virtual {v1, p1}, Le6/b;->h(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v1, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public setHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 11
    .line 12
    iget-object v2, v0, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    if-eq v2, p1, :cond_0

    .line 15
    .line 16
    iput-object p1, v0, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Le6/b;->h(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public setLengthCounter(Lm6/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Lm6/y;

    .line 2
    .line 3
    return-void
.end method

.method public setMaxEms(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxEms(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMaxWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setMinEms(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinEms(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMinWidth(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMinWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleEnabled(Z)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget v1, v0, Lm6/n;->z:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lm6/n;->f(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {v0, p1}, Lm6/n;->f(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void
.end method

.method public setPasswordVisibilityToggleTintList(Landroid/content/res/ColorStateList;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object v1, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 10
    .line 11
    invoke-static {v2, v0, p1, v1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setPasswordVisibilityToggleTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    iget-object v1, v0, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object v2, v0, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    iget-object v0, v0, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 10
    .line 11
    invoke-static {v2, v0, v1, p1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setPlaceholderText(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroidx/appcompat/widget/i1;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v0, v2, v1}, Landroidx/appcompat/widget/i1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 16
    .line 17
    const v2, 0x7f0a01ec

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-static {v0, v2}, Lg0/h0;->s(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->d()Lq3/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lq3/i;

    .line 34
    .line 35
    const-wide/16 v2, 0x43

    .line 36
    .line 37
    iput-wide v2, v0, Lq3/s;->b:J

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->d()Lq3/i;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Lq3/i;

    .line 44
    .line 45
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:Ljava/lang/CharSequence;

    .line 75
    .line 76
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->u(Landroid/text/Editable;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public setPlaceholderTextAppearance(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setPrefixText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, p1

    .line 15
    :goto_0
    iput-object v1, v0, Lm6/v;->c:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget-object v1, v0, Lm6/v;->b:Landroidx/appcompat/widget/i1;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lm6/v;->d()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setPrefixTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->b:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPrefixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->b:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShapeAppearanceModel(Lj6/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lj6/g;->a:Lj6/f;

    .line 6
    .line 7
    iget-object v0, v0, Lj6/f;->a:Lj6/k;

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Lj6/k;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setStartIconCheckable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setStartIconContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setStartIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setStartIconDrawable(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    invoke-virtual {v0, p1}, Lm6/v;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStartIconMinSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget v1, v0, Lm6/v;->x:I

    .line 6
    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Lm6/v;->x:I

    .line 10
    .line 11
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "startIconSize cannot be less than 0"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/v;->z:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/v;->z:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lp7/a0;->U(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setStartIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iput-object p1, v0, Lm6/v;->y:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/v;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/v;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/v;->f:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/v;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, p1, v1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStartIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    iget-object v1, v0, Lm6/v;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lm6/v;->f:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v1, v0, Lm6/v;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    iget-object v2, v0, Lm6/v;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 12
    .line 13
    iget-object v0, v0, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 14
    .line 15
    invoke-static {v2, v0, v1, p1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStartIconVisible(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm6/v;->b(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSuffixText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, p1

    .line 15
    :goto_0
    iput-object v1, v0, Lm6/n;->G:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget-object v1, v0, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lm6/n;->m()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setSuffixTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setSuffixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 2
    .line 3
    iget-object v0, v0, Lm6/n;->H:Landroidx/appcompat/widget/i1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTextInputAccessibilityDelegate(Lm6/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:Landroid/graphics/Typeface;

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:Landroid/graphics/Typeface;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Le6/b;->m(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 13
    .line 14
    iget-object v1, v0, Lm6/r;->B:Landroid/graphics/Typeface;

    .line 15
    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    iput-object p1, v0, Lm6/r;->B:Landroid/graphics/Typeface;

    .line 19
    .line 20
    iget-object v1, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, v0, Lm6/r;->y:Landroidx/appcompat/widget/i1;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final t(ZZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v3

    .line 24
    :goto_0
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v4, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v3

    .line 37
    :goto_1
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Le6/b;

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Le6/b;->i(Landroid/content/res/ColorStateList;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const/4 v5, 0x0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const v7, -0x101009e

    .line 54
    .line 55
    .line 56
    filled-new-array {v7}, [I

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:I

    .line 61
    .line 62
    invoke-virtual {v0, v7, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:I

    .line 68
    .line 69
    :goto_2
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v6, v0}, Le6/b;->i(Landroid/content/res/ColorStateList;)V

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Lm6/r;

    .line 84
    .line 85
    iget-object v0, v0, Lm6/r;->r:Landroidx/appcompat/widget/i1;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move-object v0, v5

    .line 95
    :goto_3
    invoke-virtual {v6, v0}, Le6/b;->i(Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v6, v0}, Le6/b;->i(Landroid/content/res/ColorStateList;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    if-eqz v4, :cond_8

    .line 116
    .line 117
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/content/res/ColorStateList;

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    iget-object v7, v6, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 122
    .line 123
    if-eq v7, v0, :cond_8

    .line 124
    .line 125
    iput-object v0, v6, Le6/b;->k:Landroid/content/res/ColorStateList;

    .line 126
    .line 127
    invoke-virtual {v6, v3}, Le6/b;->h(Z)V

    .line 128
    .line 129
    .line 130
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 131
    .line 132
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 133
    .line 134
    if-nez v1, :cond_f

    .line 135
    .line 136
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Z

    .line 137
    .line 138
    if-eqz v1, :cond_f

    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_9

    .line 145
    .line 146
    if-eqz v4, :cond_9

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_9
    if-nez p2, :cond_a

    .line 150
    .line 151
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 152
    .line 153
    if-nez p2, :cond_15

    .line 154
    .line 155
    :cond_a
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 156
    .line 157
    if-eqz p2, :cond_b

    .line 158
    .line 159
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-eqz p2, :cond_b

    .line 164
    .line 165
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 166
    .line 167
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 168
    .line 169
    .line 170
    :cond_b
    const/4 p2, 0x0

    .line 171
    if-eqz p1, :cond_c

    .line 172
    .line 173
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 174
    .line 175
    if-eqz p1, :cond_c

    .line 176
    .line 177
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->a(F)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_c
    invoke-virtual {v6, p2}, Le6/b;->k(F)V

    .line 182
    .line 183
    .line 184
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_d

    .line 189
    .line 190
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 191
    .line 192
    check-cast p1, Lm6/h;

    .line 193
    .line 194
    iget-object p1, p1, Lm6/h;->O:Lm6/f;

    .line 195
    .line 196
    iget-object p1, p1, Lm6/f;->v:Landroid/graphics/RectF;

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    xor-int/2addr p1, v2

    .line 203
    if-eqz p1, :cond_d

    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_d

    .line 210
    .line 211
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 212
    .line 213
    check-cast p1, Lm6/h;

    .line 214
    .line 215
    invoke-virtual {p1, p2, p2, p2, p2}, Lm6/h;->n(FFFF)V

    .line 216
    .line 217
    .line 218
    :cond_d
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 219
    .line 220
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 221
    .line 222
    if-eqz p1, :cond_e

    .line 223
    .line 224
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 225
    .line 226
    if-eqz p2, :cond_e

    .line 227
    .line 228
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 232
    .line 233
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Lq3/i;

    .line 234
    .line 235
    invoke-static {p1, p2}, Lq3/v;->a(Landroid/view/ViewGroup;Lq3/s;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 239
    .line 240
    const/4 p2, 0x4

    .line 241
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    :cond_e
    iput-boolean v2, v7, Lm6/v;->A:Z

    .line 245
    .line 246
    invoke-virtual {v7}, Lm6/v;->d()V

    .line 247
    .line 248
    .line 249
    iput-boolean v2, v0, Lm6/n;->I:Z

    .line 250
    .line 251
    invoke-virtual {v0}, Lm6/n;->m()V

    .line 252
    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_f
    :goto_6
    if-nez p2, :cond_10

    .line 256
    .line 257
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 258
    .line 259
    if-eqz p2, :cond_15

    .line 260
    .line 261
    :cond_10
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 262
    .line 263
    if-eqz p2, :cond_11

    .line 264
    .line 265
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-eqz p2, :cond_11

    .line 270
    .line 271
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Landroid/animation/ValueAnimator;

    .line 272
    .line 273
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 274
    .line 275
    .line 276
    :cond_11
    const/high16 p2, 0x3f800000    # 1.0f

    .line 277
    .line 278
    if-eqz p1, :cond_12

    .line 279
    .line 280
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 281
    .line 282
    if-eqz p1, :cond_12

    .line 283
    .line 284
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->a(F)V

    .line 285
    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_12
    invoke-virtual {v6, p2}, Le6/b;->k(F)V

    .line 289
    .line 290
    .line 291
    :goto_7
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 292
    .line 293
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-eqz p1, :cond_13

    .line 298
    .line 299
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 300
    .line 301
    .line 302
    :cond_13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 303
    .line 304
    if-nez p1, :cond_14

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_14
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    :goto_8
    invoke-virtual {p0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->u(Landroid/text/Editable;)V

    .line 312
    .line 313
    .line 314
    iput-boolean v3, v7, Lm6/v;->A:Z

    .line 315
    .line 316
    invoke-virtual {v7}, Lm6/v;->d()V

    .line 317
    .line 318
    .line 319
    iput-boolean v3, v0, Lm6/n;->I:Z

    .line 320
    .line 321
    invoke-virtual {v0}, Lm6/n;->m()V

    .line 322
    .line 323
    .line 324
    :cond_15
    :goto_9
    return-void
.end method

.method public final u(Landroid/text/Editable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Lm6/y;

    .line 2
    .line 3
    check-cast v0, Lh3/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:Ljava/lang/CharSequence;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lq3/i;

    .line 49
    .line 50
    invoke-static {v1, p1}, Lq3/v;->a(Landroid/view/ViewGroup;Lq3/s;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Lq3/i;

    .line 82
    .line 83
    invoke-static {v1, p1}, Lq3/v;->a(Landroid/view/ViewGroup;Lq3/s;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Landroidx/appcompat/widget/i1;

    .line 87
    .line 88
    const/4 v0, 0x4

    .line 89
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_1
    return-void
.end method

.method public final v(ZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    const v2, 0x1010367

    .line 10
    .line 11
    .line 12
    const v3, 0x101009e

    .line 13
    .line 14
    .line 15
    filled-new-array {v2, v3}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    const v4, 0x10102fe

    .line 26
    .line 27
    .line 28
    filled-new-array {v4, v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, v3, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iput v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 47
    .line 48
    :goto_0
    return-void
.end method

.method public final w()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1e

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_c

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    move v0, v2

    .line 33
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isHovered()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_4

    .line 38
    .line 39
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->isHovered()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move v3, v1

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    :goto_2
    move v3, v2

    .line 53
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    iget-boolean v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 64
    .line 65
    if-eqz v4, :cond_6

    .line 66
    .line 67
    :cond_5
    move v1, v2

    .line 68
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_7

    .line 73
    .line 74
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:I

    .line 75
    .line 76
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_9

    .line 84
    .line 85
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 86
    .line 87
    if-eqz v4, :cond_8

    .line 88
    .line 89
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->v(ZZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_9
    iget-boolean v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:Z

    .line 101
    .line 102
    if-eqz v4, :cond_b

    .line 103
    .line 104
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Landroidx/appcompat/widget/i1;

    .line 105
    .line 106
    if-eqz v4, :cond_b

    .line 107
    .line 108
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 109
    .line 110
    if-eqz v5, :cond_a

    .line 111
    .line 112
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->v(ZZ)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_a
    invoke-virtual {v4}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_b
    if-eqz v0, :cond_c

    .line 124
    .line 125
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 126
    .line 127
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_c
    if-eqz v3, :cond_d

    .line 131
    .line 132
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:I

    .line 133
    .line 134
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_d
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 138
    .line 139
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 140
    .line 141
    :goto_4
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 142
    .line 143
    const/16 v5, 0x1d

    .line 144
    .line 145
    if-lt v4, v5, :cond_14

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const v5, 0x7f0400ea

    .line 152
    .line 153
    .line 154
    invoke-static {v4, v5}, Lq6/g;->a0(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    if-nez v5, :cond_e

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_e
    iget v6, v5, Landroid/util/TypedValue;->resourceId:I

    .line 162
    .line 163
    if-eqz v6, :cond_f

    .line 164
    .line 165
    invoke-static {v4, v6}, Lx/j;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    goto :goto_6

    .line 170
    :cond_f
    iget v4, v5, Landroid/util/TypedValue;->data:I

    .line 171
    .line 172
    if-eqz v4, :cond_10

    .line 173
    .line 174
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    goto :goto_6

    .line 179
    :cond_10
    :goto_5
    const/4 v4, 0x0

    .line 180
    :goto_6
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 181
    .line 182
    if-eqz v5, :cond_14

    .line 183
    .line 184
    invoke-static {v5}, Ll1/f0;->b(Landroid/widget/EditText;)Landroid/graphics/drawable/Drawable;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    if-eqz v5, :cond_14

    .line 189
    .line 190
    if-nez v4, :cond_11

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_11
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 194
    .line 195
    invoke-static {v5}, Ll1/f0;->b(Landroid/widget/EditText;)Landroid/graphics/drawable/Drawable;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    if-eqz v1, :cond_13

    .line 200
    .line 201
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/content/res/ColorStateList;

    .line 202
    .line 203
    if-eqz v1, :cond_12

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_12
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:I

    .line 207
    .line 208
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_7
    move-object v4, v1

    .line 213
    :cond_13
    invoke-static {v5, v4}, La0/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 214
    .line 215
    .line 216
    :cond_14
    :goto_8
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lm6/n;

    .line 217
    .line 218
    invoke-virtual {v1}, Lm6/n;->k()V

    .line 219
    .line 220
    .line 221
    iget-object v4, v1, Lm6/n;->c:Lcom/google/android/material/internal/CheckableImageButton;

    .line 222
    .line 223
    iget-object v5, v1, Lm6/n;->d:Landroid/content/res/ColorStateList;

    .line 224
    .line 225
    iget-object v6, v1, Lm6/n;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 226
    .line 227
    invoke-static {v6, v4, v5}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v1, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 231
    .line 232
    iget-object v5, v1, Lm6/n;->x:Lcom/google/android/material/internal/CheckableImageButton;

    .line 233
    .line 234
    invoke-static {v6, v5, v4}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Lm6/n;->b()Lm6/o;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    instance-of v4, v4, Lm6/k;

    .line 242
    .line 243
    if-eqz v4, :cond_16

    .line 244
    .line 245
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_15

    .line 250
    .line 251
    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    if-eqz v4, :cond_15

    .line 256
    .line 257
    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-static {v1, v4}, La0/b;->g(Landroid/graphics/drawable/Drawable;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v1}, Landroidx/appcompat/widget/c0;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 273
    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_15
    iget-object v4, v1, Lm6/n;->B:Landroid/content/res/ColorStateList;

    .line 277
    .line 278
    iget-object v1, v1, Lm6/n;->C:Landroid/graphics/PorterDuff$Mode;

    .line 279
    .line 280
    invoke-static {v6, v5, v4, v1}, Lp7/a0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 281
    .line 282
    .line 283
    :cond_16
    :goto_9
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b:Lm6/v;

    .line 284
    .line 285
    iget-object v4, v1, Lm6/v;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 286
    .line 287
    iget-object v5, v1, Lm6/v;->e:Landroid/content/res/ColorStateList;

    .line 288
    .line 289
    iget-object v1, v1, Lm6/v;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 290
    .line 291
    invoke-static {v1, v4, v5}, Lp7/a0;->T(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 292
    .line 293
    .line 294
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 295
    .line 296
    const/4 v4, 0x2

    .line 297
    if-ne v1, v4, :cond_19

    .line 298
    .line 299
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 300
    .line 301
    if-eqz v0, :cond_17

    .line 302
    .line 303
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_17

    .line 308
    .line 309
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 310
    .line 311
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_17
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 315
    .line 316
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 317
    .line 318
    :goto_a
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 319
    .line 320
    if-eq v4, v1, :cond_19

    .line 321
    .line 322
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_19

    .line 327
    .line 328
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 329
    .line 330
    if-nez v1, :cond_19

    .line 331
    .line 332
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_18

    .line 337
    .line 338
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Lj6/g;

    .line 339
    .line 340
    check-cast v1, Lm6/h;

    .line 341
    .line 342
    const/4 v4, 0x0

    .line 343
    invoke-virtual {v1, v4, v4, v4, v4}, Lm6/h;->n(FFFF)V

    .line 344
    .line 345
    .line 346
    :cond_18
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 347
    .line 348
    .line 349
    :cond_19
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 350
    .line 351
    if-ne v1, v2, :cond_1d

    .line 352
    .line 353
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-nez v1, :cond_1a

    .line 358
    .line 359
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 360
    .line 361
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_1a
    if-eqz v3, :cond_1b

    .line 365
    .line 366
    if-nez v0, :cond_1b

    .line 367
    .line 368
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    .line 369
    .line 370
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_1b
    if-eqz v0, :cond_1c

    .line 374
    .line 375
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 376
    .line 377
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_1c
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 381
    .line 382
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:I

    .line 383
    .line 384
    :cond_1d
    :goto_b
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 385
    .line 386
    .line 387
    :cond_1e
    :goto_c
    return-void
.end method
