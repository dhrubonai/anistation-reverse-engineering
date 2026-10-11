.class public abstract Landroidx/appcompat/app/a;
.super Landroidx/fragment/app/b0;
.source "SourceFile"

# interfaces
.implements Lf/m;


# instance fields
.field public a:Lf/g0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/b0;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/activity/j;->getSavedStateRegistry()Ln3/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lf/k;

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    check-cast v2, Lg8/a;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lf/k;-><init>(Lg8/a;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "androidx:appcompat"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Ln3/e;->c(Ljava/lang/String;Ln3/d;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lf/l;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, Lf/l;-><init>(Landroidx/appcompat/app/a;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/activity/j;->addOnContextAvailableListener(Lb/b;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1, p2}, Lf/q;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lf/g0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lf/g0;->g0:Z

    .line 9
    .line 10
    iget v2, v0, Lf/g0;->k0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lf/q;->b:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lf/g0;->E(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lf/q;->d(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_7

    .line 28
    .line 29
    invoke-static {p1}, Lf/q;->d(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    sget-boolean v2, Lf/q;->f:Z

    .line 43
    .line 44
    if-nez v2, :cond_7

    .line 45
    .line 46
    sget-object v2, Lf/q;->a:Lf/n0;

    .line 47
    .line 48
    new-instance v3, Lf/n;

    .line 49
    .line 50
    invoke-direct {v3, p1}, Lf/n;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lf/n0;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    sget-object v2, Lf/q;->z:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v2

    .line 60
    :try_start_0
    sget-object v3, Lf/q;->c:Lc0/i;

    .line 61
    .line 62
    if-nez v3, :cond_5

    .line 63
    .line 64
    sget-object v3, Lf/q;->d:Lc0/i;

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, Lcom/bumptech/glide/d;->V(Landroid/content/Context;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3}, Lc0/i;->b(Ljava/lang/String;)Lc0/i;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    sput-object v3, Lf/q;->d:Lc0/i;

    .line 77
    .line 78
    :cond_3
    sget-object v3, Lf/q;->d:Lc0/i;

    .line 79
    .line 80
    iget-object v3, v3, Lc0/i;->a:Lc0/k;

    .line 81
    .line 82
    invoke-interface {v3}, Lc0/k;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    monitor-exit v2

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    sget-object v3, Lf/q;->d:Lc0/i;

    .line 91
    .line 92
    sput-object v3, Lf/q;->c:Lc0/i;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    sget-object v4, Lf/q;->d:Lc0/i;

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Lc0/i;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_6

    .line 102
    .line 103
    sget-object v3, Lf/q;->c:Lc0/i;

    .line 104
    .line 105
    sput-object v3, Lf/q;->d:Lc0/i;

    .line 106
    .line 107
    iget-object v3, v3, Lc0/i;->a:Lc0/k;

    .line 108
    .line 109
    invoke-interface {v3}, Lc0/k;->a()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-static {p1, v3}, Lcom/bumptech/glide/d;->Q(Landroid/content/Context;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_1
    monitor-exit v2

    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    throw p1

    .line 121
    :cond_7
    :goto_2
    invoke-static {p1}, Lf/g0;->o(Landroid/content/Context;)Lc0/i;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    sget-boolean v3, Lf/g0;->C0:Z

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    const/4 v5, 0x0

    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 132
    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    invoke-static {p1, v0, v2, v5, v4}, Lf/g0;->u(Landroid/content/Context;ILc0/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :try_start_1
    move-object v6, p1

    .line 140
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 141
    .line 142
    invoke-virtual {v6, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :catch_0
    :cond_8
    instance-of v3, p1, Li/e;

    .line 148
    .line 149
    if-eqz v3, :cond_9

    .line 150
    .line 151
    invoke-static {p1, v0, v2, v5, v4}, Lf/g0;->u(Landroid/content/Context;ILc0/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :try_start_2
    move-object v6, p1

    .line 156
    check-cast v6, Li/e;

    .line 157
    .line 158
    invoke-virtual {v6, v3}, Li/e;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 159
    .line 160
    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :catch_1
    :cond_9
    sget-boolean v3, Lf/g0;->B0:Z

    .line 164
    .line 165
    if-nez v3, :cond_a

    .line 166
    .line 167
    goto/16 :goto_6

    .line 168
    .line 169
    :cond_a
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    new-instance v6, Landroid/content/res/Configuration;

    .line 172
    .line 173
    invoke-direct {v6}, Landroid/content/res/Configuration;-><init>()V

    .line 174
    .line 175
    .line 176
    const/4 v7, -0x1

    .line 177
    iput v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    iput v7, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 181
    .line 182
    invoke-virtual {p1, v6}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    iget v9, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    iput v9, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 205
    .line 206
    invoke-virtual {v6, v8}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-nez v9, :cond_22

    .line 211
    .line 212
    new-instance v5, Landroid/content/res/Configuration;

    .line 213
    .line 214
    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    .line 215
    .line 216
    .line 217
    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 218
    .line 219
    invoke-virtual {v6, v8}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-nez v7, :cond_b

    .line 224
    .line 225
    goto/16 :goto_4

    .line 226
    .line 227
    :cond_b
    iget v7, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 228
    .line 229
    iget v9, v8, Landroid/content/res/Configuration;->fontScale:F

    .line 230
    .line 231
    cmpl-float v7, v7, v9

    .line 232
    .line 233
    if-eqz v7, :cond_c

    .line 234
    .line 235
    iput v9, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 236
    .line 237
    :cond_c
    iget v7, v6, Landroid/content/res/Configuration;->mcc:I

    .line 238
    .line 239
    iget v9, v8, Landroid/content/res/Configuration;->mcc:I

    .line 240
    .line 241
    if-eq v7, v9, :cond_d

    .line 242
    .line 243
    iput v9, v5, Landroid/content/res/Configuration;->mcc:I

    .line 244
    .line 245
    :cond_d
    iget v7, v6, Landroid/content/res/Configuration;->mnc:I

    .line 246
    .line 247
    iget v9, v8, Landroid/content/res/Configuration;->mnc:I

    .line 248
    .line 249
    if-eq v7, v9, :cond_e

    .line 250
    .line 251
    iput v9, v5, Landroid/content/res/Configuration;->mnc:I

    .line 252
    .line 253
    :cond_e
    const/16 v7, 0x18

    .line 254
    .line 255
    if-lt v3, v7, :cond_f

    .line 256
    .line 257
    invoke-static {v6, v8, v5}, Lf/x;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_f
    iget-object v7, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 262
    .line 263
    iget-object v9, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 264
    .line 265
    invoke-static {v7, v9}, Lf0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-nez v7, :cond_10

    .line 270
    .line 271
    iget-object v7, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 272
    .line 273
    iput-object v7, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 274
    .line 275
    :cond_10
    :goto_3
    iget v7, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 276
    .line 277
    iget v9, v8, Landroid/content/res/Configuration;->touchscreen:I

    .line 278
    .line 279
    if-eq v7, v9, :cond_11

    .line 280
    .line 281
    iput v9, v5, Landroid/content/res/Configuration;->touchscreen:I

    .line 282
    .line 283
    :cond_11
    iget v7, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 284
    .line 285
    iget v9, v8, Landroid/content/res/Configuration;->keyboard:I

    .line 286
    .line 287
    if-eq v7, v9, :cond_12

    .line 288
    .line 289
    iput v9, v5, Landroid/content/res/Configuration;->keyboard:I

    .line 290
    .line 291
    :cond_12
    iget v7, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 292
    .line 293
    iget v9, v8, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 294
    .line 295
    if-eq v7, v9, :cond_13

    .line 296
    .line 297
    iput v9, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 298
    .line 299
    :cond_13
    iget v7, v6, Landroid/content/res/Configuration;->navigation:I

    .line 300
    .line 301
    iget v9, v8, Landroid/content/res/Configuration;->navigation:I

    .line 302
    .line 303
    if-eq v7, v9, :cond_14

    .line 304
    .line 305
    iput v9, v5, Landroid/content/res/Configuration;->navigation:I

    .line 306
    .line 307
    :cond_14
    iget v7, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 308
    .line 309
    iget v9, v8, Landroid/content/res/Configuration;->navigationHidden:I

    .line 310
    .line 311
    if-eq v7, v9, :cond_15

    .line 312
    .line 313
    iput v9, v5, Landroid/content/res/Configuration;->navigationHidden:I

    .line 314
    .line 315
    :cond_15
    iget v7, v6, Landroid/content/res/Configuration;->orientation:I

    .line 316
    .line 317
    iget v9, v8, Landroid/content/res/Configuration;->orientation:I

    .line 318
    .line 319
    if-eq v7, v9, :cond_16

    .line 320
    .line 321
    iput v9, v5, Landroid/content/res/Configuration;->orientation:I

    .line 322
    .line 323
    :cond_16
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 324
    .line 325
    and-int/lit8 v7, v7, 0xf

    .line 326
    .line 327
    iget v9, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 328
    .line 329
    and-int/lit8 v9, v9, 0xf

    .line 330
    .line 331
    if-eq v7, v9, :cond_17

    .line 332
    .line 333
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 334
    .line 335
    or-int/2addr v7, v9

    .line 336
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 337
    .line 338
    :cond_17
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 339
    .line 340
    and-int/lit16 v7, v7, 0xc0

    .line 341
    .line 342
    iget v9, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 343
    .line 344
    and-int/lit16 v9, v9, 0xc0

    .line 345
    .line 346
    if-eq v7, v9, :cond_18

    .line 347
    .line 348
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 349
    .line 350
    or-int/2addr v7, v9

    .line 351
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 352
    .line 353
    :cond_18
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 354
    .line 355
    and-int/lit8 v7, v7, 0x30

    .line 356
    .line 357
    iget v9, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 358
    .line 359
    and-int/lit8 v9, v9, 0x30

    .line 360
    .line 361
    if-eq v7, v9, :cond_19

    .line 362
    .line 363
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 364
    .line 365
    or-int/2addr v7, v9

    .line 366
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 367
    .line 368
    :cond_19
    iget v7, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 369
    .line 370
    and-int/lit16 v7, v7, 0x300

    .line 371
    .line 372
    iget v9, v8, Landroid/content/res/Configuration;->screenLayout:I

    .line 373
    .line 374
    and-int/lit16 v9, v9, 0x300

    .line 375
    .line 376
    if-eq v7, v9, :cond_1a

    .line 377
    .line 378
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 379
    .line 380
    or-int/2addr v7, v9

    .line 381
    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 382
    .line 383
    :cond_1a
    const/16 v7, 0x1a

    .line 384
    .line 385
    if-lt v3, v7, :cond_1c

    .line 386
    .line 387
    invoke-static {v6}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    and-int/lit8 v3, v3, 0x3

    .line 392
    .line 393
    invoke-static {v8}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    and-int/lit8 v7, v7, 0x3

    .line 398
    .line 399
    if-eq v3, v7, :cond_1b

    .line 400
    .line 401
    invoke-static {v5}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-static {v8}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    and-int/lit8 v7, v7, 0x3

    .line 410
    .line 411
    or-int/2addr v3, v7

    .line 412
    invoke-static {v5, v3}, Lb2/h;->s(Landroid/content/res/Configuration;I)V

    .line 413
    .line 414
    .line 415
    :cond_1b
    invoke-static {v6}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    and-int/lit8 v3, v3, 0xc

    .line 420
    .line 421
    invoke-static {v8}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 422
    .line 423
    .line 424
    move-result v7

    .line 425
    and-int/lit8 v7, v7, 0xc

    .line 426
    .line 427
    if-eq v3, v7, :cond_1c

    .line 428
    .line 429
    invoke-static {v5}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    invoke-static {v8}, Lb2/h;->a(Landroid/content/res/Configuration;)I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    and-int/lit8 v7, v7, 0xc

    .line 438
    .line 439
    or-int/2addr v3, v7

    .line 440
    invoke-static {v5, v3}, Lb2/h;->s(Landroid/content/res/Configuration;I)V

    .line 441
    .line 442
    .line 443
    :cond_1c
    iget v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 444
    .line 445
    and-int/lit8 v3, v3, 0xf

    .line 446
    .line 447
    iget v7, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 448
    .line 449
    and-int/lit8 v7, v7, 0xf

    .line 450
    .line 451
    if-eq v3, v7, :cond_1d

    .line 452
    .line 453
    iget v3, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 454
    .line 455
    or-int/2addr v3, v7

    .line 456
    iput v3, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 457
    .line 458
    :cond_1d
    iget v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 459
    .line 460
    and-int/lit8 v3, v3, 0x30

    .line 461
    .line 462
    iget v7, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 463
    .line 464
    and-int/lit8 v7, v7, 0x30

    .line 465
    .line 466
    if-eq v3, v7, :cond_1e

    .line 467
    .line 468
    iget v3, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 469
    .line 470
    or-int/2addr v3, v7

    .line 471
    iput v3, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 472
    .line 473
    :cond_1e
    iget v3, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 474
    .line 475
    iget v7, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 476
    .line 477
    if-eq v3, v7, :cond_1f

    .line 478
    .line 479
    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 480
    .line 481
    :cond_1f
    iget v3, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 482
    .line 483
    iget v7, v8, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 484
    .line 485
    if-eq v3, v7, :cond_20

    .line 486
    .line 487
    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 488
    .line 489
    :cond_20
    iget v3, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 490
    .line 491
    iget v7, v8, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 492
    .line 493
    if-eq v3, v7, :cond_21

    .line 494
    .line 495
    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 496
    .line 497
    :cond_21
    iget v3, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 498
    .line 499
    iget v6, v8, Landroid/content/res/Configuration;->densityDpi:I

    .line 500
    .line 501
    if-eq v3, v6, :cond_22

    .line 502
    .line 503
    iput v6, v5, Landroid/content/res/Configuration;->densityDpi:I

    .line 504
    .line 505
    :cond_22
    :goto_4
    invoke-static {p1, v0, v2, v5, v1}, Lf/g0;->u(Landroid/content/Context;ILc0/i;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    new-instance v2, Li/e;

    .line 510
    .line 511
    const v3, 0x7f130237

    .line 512
    .line 513
    .line 514
    invoke-direct {v2, p1, v3}, Li/e;-><init>(Landroid/content/Context;I)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v0}, Li/e;->a(Landroid/content/res/Configuration;)V

    .line 518
    .line 519
    .line 520
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 521
    .line 522
    .line 523
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2

    .line 524
    if-eqz p1, :cond_23

    .line 525
    .line 526
    goto :goto_5

    .line 527
    :cond_23
    move v1, v4

    .line 528
    :goto_5
    move v4, v1

    .line 529
    :catch_2
    if-eqz v4, :cond_24

    .line 530
    .line 531
    invoke-virtual {v2}, Li/e;->getTheme()Landroid/content/res/Resources$Theme;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    invoke-static {p1}, Lcom/bumptech/glide/c;->c0(Landroid/content/res/Resources$Theme;)V

    .line 536
    .line 537
    .line 538
    :cond_24
    move-object p1, v2

    .line 539
    :goto_6
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    .line 540
    .line 541
    .line 542
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lf/g0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lf/g0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1}, Lw/n;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lf/g0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lf/g0;->x()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lf/g0;->C:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final g()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lj5/a;->e0(Landroid/view/View;Landroidx/lifecycle/u;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "<this>"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const v2, 0x7f0a020a

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const v1, 0x7f0a0209

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0, p0}, Lj5/a;->d0(Landroid/view/View;Landroidx/activity/s;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lf/g0;

    .line 6
    .line 7
    iget-object v1, v0, Lf/g0;->G:Li/k;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Li/k;

    .line 15
    .line 16
    iget-object v2, v0, Lf/g0;->F:Lf/u0;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lf/u0;->p0()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lf/g0;->B:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Li/k;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lf/g0;->G:Li/k;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lf/g0;->G:Li/k;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Landroidx/appcompat/widget/l4;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lf/q;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k()Lf/q;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Lf/g0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lf/q;->a:Lf/n0;

    .line 6
    .line 7
    new-instance v0, Lf/g0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lf/g0;-><init>(Landroid/content/Context;Landroid/view/Window;Lf/m;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/app/a;->a:Lf/g0;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/a;->a:Lf/g0;

    .line 16
    .line 17
    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/j;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lf/g0;

    .line 9
    .line 10
    iget-boolean v0, p1, Lf/g0;->X:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lf/g0;->R:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lf/g0;->D()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lf/g0;->F:Lf/u0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lf/u0;->C:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/high16 v2, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lf/u0;->s0(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Landroidx/appcompat/widget/x;->a()Landroidx/appcompat/widget/x;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p1, Lf/g0;->B:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v2, v0, Landroidx/appcompat/widget/x;->a:Landroidx/appcompat/widget/y2;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/y2;->k(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v0

    .line 53
    new-instance v0, Landroid/content/res/Configuration;

    .line 54
    .line 55
    iget-object v1, p1, Lf/g0;->B:Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p1, Lf/g0;->j0:Landroid/content/res/Configuration;

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p1, v0, v0}, Lf/g0;->m(ZZ)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    monitor-exit v0

    .line 77
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/b0;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lf/q;->f()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    move v0, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v0, 0x0

    .line 65
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    .line 67
    return v2

    .line 68
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/b0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lf/g0;

    .line 14
    .line 15
    invoke-virtual {p1}, Lf/g0;->D()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lf/g0;->F:Lf/u0;

    .line 19
    .line 20
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const v1, 0x102002c

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-ne p2, v1, :cond_9

    .line 29
    .line 30
    if-eqz p1, :cond_9

    .line 31
    .line 32
    iget-object p1, p1, Lf/u0;->G:Landroidx/appcompat/widget/u1;

    .line 33
    .line 34
    check-cast p1, Landroidx/appcompat/widget/g4;

    .line 35
    .line 36
    iget p1, p1, Landroidx/appcompat/widget/g4;->b:I

    .line 37
    .line 38
    and-int/lit8 p1, p1, 0x4

    .line 39
    .line 40
    if-eqz p1, :cond_9

    .line 41
    .line 42
    invoke-static {p0}, Lj5/a;->z(Landroid/app/Activity;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_8

    .line 47
    .line 48
    invoke-static {p0, p1}, Lw/p;->c(Landroid/app/Activity;Landroid/content/Intent;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_7

    .line 53
    .line 54
    new-instance p1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lj5/a;->z(Landroid/app/Activity;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-nez p2, :cond_1

    .line 64
    .line 65
    invoke-static {p0}, Lj5/a;->z(Landroid/app/Activity;)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    :cond_1
    if-eqz p2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :try_start_0
    invoke-static {p0, v1}, Lj5/a;->A(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    :goto_0
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {p0, v1}, Lj5/a;->A(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catch_0
    move-exception p1

    .line 112
    const-string p2, "TaskStackBuilder"

    .line 113
    .line 114
    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 115
    .line 116
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 120
    .line 121
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-nez p2, :cond_6

    .line 130
    .line 131
    new-array p2, v2, [Landroid/content/Intent;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, [Landroid/content/Intent;

    .line 138
    .line 139
    new-instance p2, Landroid/content/Intent;

    .line 140
    .line 141
    aget-object v1, p1, v2

    .line 142
    .line 143
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 144
    .line 145
    .line 146
    const v1, 0x1000c000

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    aput-object p2, p1, v2

    .line 154
    .line 155
    const/4 p2, 0x0

    .line 156
    invoke-static {p0, p1, p2}, Lx/j;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-nez p2, :cond_5

    .line 161
    .line 162
    new-instance p2, Landroid/content/Intent;

    .line 163
    .line 164
    array-length v1, p1

    .line 165
    add-int/lit8 v1, v1, -0x1

    .line 166
    .line 167
    aget-object p1, p1, v1

    .line 168
    .line 169
    invoke-direct {p2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 170
    .line 171
    .line 172
    const/high16 p1, 0x10000000

    .line 173
    .line 174
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    :try_start_1
    sget p1, Lw/g;->a:I

    .line 181
    .line 182
    invoke-static {p0}, Lw/a;->a(Landroid/app/Activity;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 193
    .line 194
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_7
    invoke-static {p0, p1}, Lw/p;->b(Landroid/app/Activity;Landroid/content/Intent;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_8
    move v0, v2

    .line 203
    :goto_2
    return v0

    .line 204
    :cond_9
    return v2
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/j;->onPanelClosed(ILandroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lf/g0;

    .line 9
    .line 10
    invoke-virtual {p1}, Lf/g0;->x()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/b0;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lf/g0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lf/g0;->F:Lf/u0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lf/u0;->V:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/b0;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lf/g0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lf/g0;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/b0;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lf/g0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lf/g0;->F:Lf/u0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lf/u0;->V:Z

    .line 19
    .line 20
    iget-object v0, v0, Lf/u0;->U:Li/m;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Li/m;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lf/q;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lf/g0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lf/g0;->D()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->g()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf/q;->i(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->g()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf/q;->j(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->g()V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf/q;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lf/g0;

    .line 9
    .line 10
    iput p1, v0, Lf/g0;->l0:I

    .line 11
    .line 12
    return-void
.end method

.method public final supportInvalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/a;->k()Lf/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lf/q;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
