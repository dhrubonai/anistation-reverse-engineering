.class public final synthetic Landroidx/activity/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Landroidx/activity/b;->a:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    goto/16 :goto_d

    .line 13
    .line 14
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ln8/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Ln8/a;->a()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-wide/16 v1, 0x208

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_3
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lz3/e;

    .line 48
    .line 49
    iget-object v0, v0, Lz3/e;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ln8/a;

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Ln8/a;->B(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_4
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ll8/z;

    .line 60
    .line 61
    const-string v1, "https://github.com/msrofficial"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ll8/z;->e(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_5
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lh8/x;

    .line 70
    .line 71
    iget-object v1, v0, Lh8/x;->x:Landroid/app/AlertDialog;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iget-object v1, v0, Lh8/x;->x:Landroid/app/AlertDialog;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 84
    .line 85
    .line 86
    :cond_0
    iget-object v0, v0, Lh8/x;->b:Landroid/content/Context;

    .line 87
    .line 88
    const-string v1, "Choose a download folder first"

    .line 89
    .line 90
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 98
    .line 99
    const-class v2, Lmsr/pistream/app/ui/home/screens/MainActivity;

    .line 100
    .line 101
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    .line 103
    .line 104
    const-string v2, "open_download_settings"

    .line 105
    .line 106
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    const/high16 v2, 0x4000000

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    instance-of v2, v0, Landroid/app/Activity;

    .line 115
    .line 116
    if-nez v2, :cond_1

    .line 117
    .line 118
    const/high16 v2, 0x10000000

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 121
    .line 122
    .line 123
    :cond_1
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catch_0
    move-exception v0

    .line 128
    const-string v1, "DownloadSheet"

    .line 129
    .line 130
    const-string v2, "settings"

    .line 131
    .line 132
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 133
    .line 134
    .line 135
    :goto_0
    return-void

    .line 136
    :pswitch_6
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lm6/k;

    .line 139
    .line 140
    iget-object v1, v0, Lm6/k;->h:Landroid/widget/AutoCompleteTextView;

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0, v1}, Lm6/k;->t(Z)V

    .line 147
    .line 148
    .line 149
    iput-boolean v1, v0, Lm6/k;->m:Z

    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_7
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lm6/d;

    .line 155
    .line 156
    invoke-virtual {v0, v6}, Lm6/d;->t(Z)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_8
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lcom/google/android/gms/common/api/internal/v;

    .line 163
    .line 164
    iput-boolean v4, v0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 165
    .line 166
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 169
    .line 170
    iget-object v1, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lo0/d;

    .line 171
    .line 172
    if-eqz v1, :cond_2

    .line 173
    .line 174
    invoke-virtual {v1}, Lo0/d;->g()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_2

    .line 179
    .line 180
    iget v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/v;->b(I)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 189
    .line 190
    iget v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 191
    .line 192
    if-ne v2, v3, :cond_3

    .line 193
    .line 194
    iget v0, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 197
    .line 198
    .line 199
    :cond_3
    :goto_1
    return-void

    .line 200
    :pswitch_9
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lj3/x;

    .line 203
    .line 204
    sget-object v1, Lj3/x;->P0:[F

    .line 205
    .line 206
    invoke-virtual {v0}, Lj3/x;->o()V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_a
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lj3/f;

    .line 213
    .line 214
    sget v1, Lj3/f;->j0:I

    .line 215
    .line 216
    invoke-virtual {v0, v4}, Lj3/f;->d(Z)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_b
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Lc2/k;

    .line 223
    .line 224
    iget-object v1, v0, Lc2/k;->y:Landroid/view/Surface;

    .line 225
    .line 226
    if-eqz v1, :cond_4

    .line 227
    .line 228
    iget-object v2, v0, Lc2/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_4

    .line 239
    .line 240
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Lj1/z;

    .line 245
    .line 246
    iget-object v3, v3, Lj1/z;->a:Lj1/d0;

    .line 247
    .line 248
    invoke-virtual {v3, v5}, Lj1/d0;->Z(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_4
    iget-object v2, v0, Lc2/k;->x:Landroid/graphics/SurfaceTexture;

    .line 253
    .line 254
    if-eqz v2, :cond_5

    .line 255
    .line 256
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 257
    .line 258
    .line 259
    :cond_5
    if-eqz v1, :cond_6

    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 262
    .line 263
    .line 264
    :cond_6
    iput-object v5, v0, Lc2/k;->x:Landroid/graphics/SurfaceTexture;

    .line 265
    .line 266
    iput-object v5, v0, Lc2/k;->y:Landroid/view/Surface;

    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_c
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Lb2/d;

    .line 272
    .line 273
    iget v1, v0, Lb2/d;->m:I

    .line 274
    .line 275
    add-int/lit8 v1, v1, -0x1

    .line 276
    .line 277
    iput v1, v0, Lb2/d;->m:I

    .line 278
    .line 279
    if-lez v1, :cond_7

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_7
    if-ltz v1, :cond_8

    .line 283
    .line 284
    iget-object v0, v0, Lb2/d;->e:Lb2/a0;

    .line 285
    .line 286
    invoke-static {v0}, Lw7/b;->w(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lb2/a0;->a()V

    .line 290
    .line 291
    .line 292
    :goto_3
    return-void

    .line 293
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    iget v0, v0, Lb2/d;->m:I

    .line 296
    .line 297
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v1

    .line 305
    :pswitch_d
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Ls1/f;

    .line 308
    .line 309
    iget-object v3, v0, Ls1/f;->a:Ljava/lang/Object;

    .line 310
    .line 311
    monitor-enter v3

    .line 312
    :try_start_1
    iget-boolean v4, v0, Ls1/f;->m:Z

    .line 313
    .line 314
    if-eqz v4, :cond_9

    .line 315
    .line 316
    monitor-exit v3

    .line 317
    goto :goto_4

    .line 318
    :cond_9
    iget-wide v4, v0, Ls1/f;->l:J

    .line 319
    .line 320
    const-wide/16 v6, 0x1

    .line 321
    .line 322
    sub-long/2addr v4, v6

    .line 323
    iput-wide v4, v0, Ls1/f;->l:J

    .line 324
    .line 325
    cmp-long v1, v4, v1

    .line 326
    .line 327
    if-lez v1, :cond_a

    .line 328
    .line 329
    monitor-exit v3

    .line 330
    goto :goto_4

    .line 331
    :cond_a
    if-gez v1, :cond_b

    .line 332
    .line 333
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 334
    .line 335
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v1}, Ls1/f;->b(Ljava/lang/IllegalStateException;)V

    .line 339
    .line 340
    .line 341
    monitor-exit v3

    .line 342
    goto :goto_4

    .line 343
    :cond_b
    invoke-virtual {v0}, Ls1/f;->a()V

    .line 344
    .line 345
    .line 346
    monitor-exit v3

    .line 347
    :goto_4
    return-void

    .line 348
    :catchall_0
    move-exception v0

    .line 349
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 350
    throw v0

    .line 351
    :pswitch_e
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lo1/d;

    .line 354
    .line 355
    invoke-virtual {v0, v5}, Lo1/d;->a(Lo1/n;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_f
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Lo1/h;

    .line 362
    .line 363
    iget-boolean v1, v0, Lo1/h;->c:Z

    .line 364
    .line 365
    if-eqz v1, :cond_c

    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_c
    iget-object v1, v0, Lo1/h;->b:Lo1/k;

    .line 369
    .line 370
    if-eqz v1, :cond_d

    .line 371
    .line 372
    iget-object v2, v0, Lo1/h;->a:Lo1/n;

    .line 373
    .line 374
    invoke-interface {v1, v2}, Lo1/k;->a(Lo1/n;)V

    .line 375
    .line 376
    .line 377
    :cond_d
    iget-object v1, v0, Lo1/h;->d:Lo1/i;

    .line 378
    .line 379
    iget-object v1, v1, Lo1/i;->D:Ljava/util/Set;

    .line 380
    .line 381
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    iput-boolean v6, v0, Lo1/h;->c:Z

    .line 385
    .line 386
    :goto_5
    return-void

    .line 387
    :pswitch_10
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Ll1/w0;

    .line 390
    .line 391
    iget-wide v3, v0, Ll1/w0;->k0:J

    .line 392
    .line 393
    const-wide/32 v7, 0x493e0

    .line 394
    .line 395
    .line 396
    cmp-long v3, v3, v7

    .line 397
    .line 398
    if-ltz v3, :cond_e

    .line 399
    .line 400
    iget-object v3, v0, Ll1/w0;->t:Lf/p0;

    .line 401
    .line 402
    iget-object v3, v3, Lf/p0;->b:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v3, Ll1/z0;

    .line 405
    .line 406
    iput-boolean v6, v3, Ll1/z0;->i1:Z

    .line 407
    .line 408
    iput-wide v1, v0, Ll1/w0;->k0:J

    .line 409
    .line 410
    :cond_e
    return-void

    .line 411
    :pswitch_11
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, Lk1/a0;

    .line 414
    .line 415
    invoke-virtual {v0}, Lk1/a0;->R()Lk1/b;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    new-instance v2, Lk1/j;

    .line 420
    .line 421
    invoke-direct {v2, v1, v3}, Lk1/j;-><init>(Lk1/b;I)V

    .line 422
    .line 423
    .line 424
    const/16 v3, 0x404

    .line 425
    .line 426
    invoke-virtual {v0, v1, v3, v2}, Lk1/a0;->W(Lk1/b;ILf1/l;)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v0, Lk1/a0;->f:Lr/e;

    .line 430
    .line 431
    invoke-virtual {v0}, Lr/e;->k()V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_12
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 436
    .line 437
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    sget v0, Lf/c0;->c:I

    .line 441
    .line 442
    throw v5

    .line 443
    :pswitch_13
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, Landroidx/lifecycle/j0;

    .line 446
    .line 447
    sget-object v1, Landroidx/lifecycle/j0;->z:Landroidx/lifecycle/j0;

    .line 448
    .line 449
    const-string v1, "this$0"

    .line 450
    .line 451
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    iget v1, v0, Landroidx/lifecycle/j0;->b:I

    .line 455
    .line 456
    if-nez v1, :cond_f

    .line 457
    .line 458
    iput-boolean v6, v0, Landroidx/lifecycle/j0;->c:Z

    .line 459
    .line 460
    iget-object v1, v0, Landroidx/lifecycle/j0;->f:Landroidx/lifecycle/w;

    .line 461
    .line 462
    sget-object v2, Landroidx/lifecycle/n;->ON_PAUSE:Landroidx/lifecycle/n;

    .line 463
    .line 464
    invoke-virtual {v1, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 465
    .line 466
    .line 467
    :cond_f
    iget v1, v0, Landroidx/lifecycle/j0;->a:I

    .line 468
    .line 469
    if-nez v1, :cond_10

    .line 470
    .line 471
    iget-boolean v1, v0, Landroidx/lifecycle/j0;->c:Z

    .line 472
    .line 473
    if-eqz v1, :cond_10

    .line 474
    .line 475
    iget-object v1, v0, Landroidx/lifecycle/j0;->f:Landroidx/lifecycle/w;

    .line 476
    .line 477
    sget-object v2, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 478
    .line 479
    invoke-virtual {v1, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 480
    .line 481
    .line 482
    iput-boolean v6, v0, Landroidx/lifecycle/j0;->d:Z

    .line 483
    .line 484
    :cond_10
    return-void

    .line 485
    :pswitch_14
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Landroid/app/Activity;

    .line 488
    .line 489
    sget v1, Lw/g;->a:I

    .line 490
    .line 491
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-nez v1, :cond_1b

    .line 496
    .line 497
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 498
    .line 499
    const/16 v2, 0x1c

    .line 500
    .line 501
    if-lt v1, v2, :cond_11

    .line 502
    .line 503
    sget-object v1, Lw/i;->a:Ljava/lang/Class;

    .line 504
    .line 505
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    .line 506
    .line 507
    .line 508
    goto/16 :goto_b

    .line 509
    .line 510
    :cond_11
    sget-object v2, Lw/i;->a:Ljava/lang/Class;

    .line 511
    .line 512
    const/16 v2, 0x1b

    .line 513
    .line 514
    const/16 v7, 0x1a

    .line 515
    .line 516
    if-eq v1, v7, :cond_13

    .line 517
    .line 518
    if-ne v1, v2, :cond_12

    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_12
    move v8, v4

    .line 522
    goto :goto_7

    .line 523
    :cond_13
    :goto_6
    move v8, v6

    .line 524
    :goto_7
    sget-object v9, Lw/i;->f:Ljava/lang/reflect/Method;

    .line 525
    .line 526
    if-eqz v8, :cond_14

    .line 527
    .line 528
    if-nez v9, :cond_14

    .line 529
    .line 530
    goto/16 :goto_c

    .line 531
    .line 532
    :cond_14
    sget-object v8, Lw/i;->e:Ljava/lang/reflect/Method;

    .line 533
    .line 534
    if-nez v8, :cond_15

    .line 535
    .line 536
    sget-object v8, Lw/i;->d:Ljava/lang/reflect/Method;

    .line 537
    .line 538
    if-nez v8, :cond_15

    .line 539
    .line 540
    goto/16 :goto_c

    .line 541
    .line 542
    :cond_15
    :try_start_2
    sget-object v8, Lw/i;->c:Ljava/lang/reflect/Field;

    .line 543
    .line 544
    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    if-nez v8, :cond_16

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_16
    sget-object v10, Lw/i;->b:Ljava/lang/reflect/Field;

    .line 552
    .line 553
    invoke-virtual {v10, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v10

    .line 557
    if-nez v10, :cond_17

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_17
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    new-instance v12, Lw/h;

    .line 565
    .line 566
    invoke-direct {v12, v0}, Lw/h;-><init>(Landroid/app/Activity;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 570
    .line 571
    .line 572
    sget-object v13, Lw/i;->g:Landroid/os/Handler;

    .line 573
    .line 574
    :try_start_3
    new-instance v14, Landroidx/appcompat/widget/j;

    .line 575
    .line 576
    invoke-direct {v14, v12, v8, v6}, Landroidx/appcompat/widget/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 580
    .line 581
    .line 582
    if-eq v1, v7, :cond_19

    .line 583
    .line 584
    if-ne v1, v2, :cond_18

    .line 585
    .line 586
    goto :goto_8

    .line 587
    :cond_18
    move v1, v4

    .line 588
    goto :goto_9

    .line 589
    :cond_19
    :goto_8
    move v1, v6

    .line 590
    :goto_9
    if-eqz v1, :cond_1a

    .line 591
    .line 592
    const/16 v1, 0x9

    .line 593
    .line 594
    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    .line 595
    .line 596
    aput-object v8, v1, v4

    .line 597
    .line 598
    aput-object v5, v1, v6

    .line 599
    .line 600
    aput-object v5, v1, v3

    .line 601
    .line 602
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    const/4 v7, 0x3

    .line 607
    aput-object v2, v1, v7

    .line 608
    .line 609
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 610
    .line 611
    const/4 v7, 0x4

    .line 612
    aput-object v2, v1, v7

    .line 613
    .line 614
    const/4 v7, 0x5

    .line 615
    aput-object v5, v1, v7

    .line 616
    .line 617
    const/4 v7, 0x6

    .line 618
    aput-object v5, v1, v7

    .line 619
    .line 620
    const/4 v5, 0x7

    .line 621
    aput-object v2, v1, v5

    .line 622
    .line 623
    const/16 v5, 0x8

    .line 624
    .line 625
    aput-object v2, v1, v5

    .line 626
    .line 627
    invoke-virtual {v9, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    goto :goto_a

    .line 631
    :cond_1a
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 632
    .line 633
    .line 634
    :goto_a
    :try_start_5
    new-instance v1, Landroidx/appcompat/widget/j;

    .line 635
    .line 636
    invoke-direct {v1, v11, v12, v3}, Landroidx/appcompat/widget/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v13, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 640
    .line 641
    .line 642
    :goto_b
    move v4, v6

    .line 643
    goto :goto_c

    .line 644
    :catchall_1
    move-exception v1

    .line 645
    new-instance v2, Landroidx/appcompat/widget/j;

    .line 646
    .line 647
    invoke-direct {v2, v11, v12, v3}, Landroidx/appcompat/widget/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v13, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 651
    .line 652
    .line 653
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 654
    :catchall_2
    :goto_c
    if-nez v4, :cond_1b

    .line 655
    .line 656
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    .line 657
    .line 658
    .line 659
    :cond_1b
    return-void

    .line 660
    :pswitch_15
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v0, Landroidx/activity/r;

    .line 663
    .line 664
    invoke-virtual {v0}, Landroidx/activity/r;->a()V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :pswitch_16
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v0, Landroidx/activity/l;

    .line 671
    .line 672
    invoke-static {v0}, Landroidx/activity/l;->d(Landroidx/activity/l;)V

    .line 673
    .line 674
    .line 675
    return-void

    .line 676
    :pswitch_17
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, Landroidx/activity/j;

    .line 679
    .line 680
    invoke-virtual {v0}, Landroidx/activity/j;->invalidateMenu()V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :goto_d
    iget-object v0, p0, Landroidx/activity/b;->b:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Lx8/e;

    .line 687
    .line 688
    iput-boolean v4, v0, Lx8/e;->i:Z

    .line 689
    .line 690
    iget-object v1, v0, Lx8/e;->d:Landroidx/lifecycle/c0;

    .line 691
    .line 692
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 693
    .line 694
    invoke-virtual {v1, v2}, Landroidx/lifecycle/c0;->j(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    iget-object v1, v0, Lx8/e;->f:Landroidx/lifecycle/c0;

    .line 698
    .line 699
    const-string v3, "Failed to load data"

    .line 700
    .line 701
    invoke-virtual {v1, v3}, Landroidx/lifecycle/c0;->j(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    iget-object v1, v0, Lx8/e;->k:Ljava/util/ArrayList;

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    iget-object v3, v0, Lx8/e;->e:Landroidx/lifecycle/c0;

    .line 711
    .line 712
    if-eqz v1, :cond_1c

    .line 713
    .line 714
    invoke-virtual {v3, v2}, Landroidx/lifecycle/c0;->j(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    goto :goto_e

    .line 718
    :cond_1c
    iput-boolean v6, v0, Lx8/e;->j:Z

    .line 719
    .line 720
    invoke-virtual {v3, v2}, Landroidx/lifecycle/c0;->j(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    :goto_e
    return-void

    .line 724
    nop

    .line 725
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
