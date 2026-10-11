.class public final Lcom/google/android/gms/common/api/internal/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/common/api/internal/t0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/internal/t0;->a:I

    .line 2
    .line 3
    const-string v1, "GoogleApiManager"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lcom/google/android/gms/common/api/internal/i0;

    .line 17
    .line 18
    iget-object v6, v5, Lcom/google/android/gms/common/api/internal/i0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v6, Lcom/google/android/gms/common/api/internal/h;

    .line 21
    .line 22
    iget-object v6, v6, Lcom/google/android/gms/common/api/internal/h;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    iget-object v7, v5, Lcom/google/android/gms/common/api/internal/i0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v7, Lcom/google/android/gms/common/api/internal/a;

    .line 27
    .line 28
    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Lcom/google/android/gms/common/api/internal/g0;

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v7, Lb5/a;

    .line 40
    .line 41
    iget v8, v7, Lb5/a;->b:I

    .line 42
    .line 43
    if-nez v8, :cond_1

    .line 44
    .line 45
    move v2, v4

    .line 46
    :cond_1
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iput-boolean v4, v5, Lcom/google/android/gms/common/api/internal/i0;->a:Z

    .line 49
    .line 50
    iget-object v2, v5, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lcom/google/android/gms/common/api/g;

    .line 53
    .line 54
    invoke-interface {v2}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-boolean v0, v5, Lcom/google/android/gms/common/api/internal/i0;->a:Z

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, v5, Lcom/google/android/gms/common/api/internal/i0;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lcom/google/android/gms/common/internal/m;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget-object v1, v5, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lcom/google/android/gms/common/api/g;

    .line 73
    .line 74
    iget-object v2, v5, Lcom/google/android/gms/common/api/internal/i0;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Ljava/util/Set;

    .line 77
    .line 78
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    :try_start_0
    check-cast v0, Lcom/google/android/gms/common/api/internal/i0;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v2, v0

    .line 87
    check-cast v2, Lcom/google/android/gms/common/api/g;

    .line 88
    .line 89
    check-cast v0, Lcom/google/android/gms/common/api/g;

    .line 90
    .line 91
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    const-string v2, "Failed to get service from broker. "

    .line 101
    .line 102
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    iget-object v0, v5, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lcom/google/android/gms/common/api/g;

    .line 108
    .line 109
    const-string v1, "Failed to get service from broker."

    .line 110
    .line 111
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Lb5/a;

    .line 115
    .line 116
    const/16 v1, 0xa

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lb5/a;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v0, v3}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v6, v7, v3}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    :goto_0
    return-void

    .line 129
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 132
    .line 133
    iget-boolean v0, v0, Lcom/google/android/gms/common/api/internal/a0;->a:Z

    .line 134
    .line 135
    if-nez v0, :cond_5

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lcom/google/android/gms/common/api/internal/c1;

    .line 142
    .line 143
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c1;->b:Lb5/a;

    .line 144
    .line 145
    iget v1, v0, Lb5/a;->b:I

    .line 146
    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    iget-object v1, v0, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    move v1, v4

    .line 154
    goto :goto_1

    .line 155
    :cond_6
    move v1, v2

    .line 156
    :goto_1
    if-eqz v1, :cond_7

    .line 157
    .line 158
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 161
    .line 162
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/l;

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v0, v0, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 169
    .line 170
    invoke-static {v0}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v5, Lcom/google/android/gms/common/api/internal/c1;

    .line 176
    .line 177
    iget v5, v5, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 178
    .line 179
    sget v6, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 180
    .line 181
    new-instance v6, Landroid/content/Intent;

    .line 182
    .line 183
    const-class v7, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 184
    .line 185
    invoke-direct {v6, v1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 186
    .line 187
    .line 188
    const-string v1, "pending_intent"

    .line 189
    .line 190
    invoke-virtual {v6, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 191
    .line 192
    .line 193
    const-string v0, "failing_client_id"

    .line 194
    .line 195
    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 196
    .line 197
    .line 198
    const-string v0, "notify_manager"

    .line 199
    .line 200
    invoke-virtual {v6, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 201
    .line 202
    .line 203
    invoke-interface {v3, v6, v4}, Lcom/google/android/gms/common/api/internal/l;->startActivityForResult(Landroid/content/Intent;I)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_2

    .line 207
    .line 208
    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 211
    .line 212
    iget-object v5, v1, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 213
    .line 214
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget v6, v0, Lb5/a;->b:I

    .line 219
    .line 220
    invoke-virtual {v5, v1, v3, v6}, Lb5/d;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-eqz v1, :cond_8

    .line 225
    .line 226
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 229
    .line 230
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 231
    .line 232
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v3, Lcom/google/android/gms/common/api/internal/a0;

    .line 239
    .line 240
    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/l;

    .line 241
    .line 242
    iget v0, v0, Lb5/a;->b:I

    .line 243
    .line 244
    invoke-virtual {v2, v1, v4, v0, v3}, Lb5/d;->h(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/l;ILcom/google/android/gms/common/api/internal/a0;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_8
    iget v1, v0, Lb5/a;->b:I

    .line 250
    .line 251
    const/16 v5, 0x12

    .line 252
    .line 253
    if-ne v1, v5, :cond_b

    .line 254
    .line 255
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 258
    .line 259
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v6, Lcom/google/android/gms/common/api/internal/a0;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v1, Landroid/widget/ProgressBar;

    .line 273
    .line 274
    const v7, 0x101007a

    .line 275
    .line 276
    .line 277
    invoke-direct {v1, v0, v3, v7}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 284
    .line 285
    .line 286
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 287
    .line 288
    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 292
    .line 293
    .line 294
    invoke-static {v0, v5}, Lcom/google/android/gms/common/internal/w;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 299
    .line 300
    .line 301
    const-string v1, ""

    .line 302
    .line 303
    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    const-string v2, "GooglePlayServicesUpdatingDialog"

    .line 311
    .line 312
    invoke-static {v0, v1, v2, v6}, Lb5/d;->f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 313
    .line 314
    .line 315
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 318
    .line 319
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 320
    .line 321
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v4, Lcom/google/android/gms/common/api/internal/z;

    .line 330
    .line 331
    invoke-direct {v4, p0, v1}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/internal/t0;Landroid/app/AlertDialog;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance v2, Landroid/content/IntentFilter;

    .line 338
    .line 339
    const-string v5, "android.intent.action.PACKAGE_ADDED"

    .line 340
    .line 341
    invoke-direct {v2, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v5, "package"

    .line 345
    .line 346
    invoke-virtual {v2, v5}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-instance v5, Lcom/google/android/gms/common/api/internal/k0;

    .line 350
    .line 351
    invoke-direct {v5, v4}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/z;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v5, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 355
    .line 356
    .line 357
    iput-object v0, v5, Lcom/google/android/gms/common/api/internal/k0;->a:Landroid/content/Context;

    .line 358
    .line 359
    invoke-static {v0}, Lb5/g;->a(Landroid/content/Context;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-nez v0, :cond_c

    .line 364
    .line 365
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 368
    .line 369
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 370
    .line 371
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 375
    .line 376
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 377
    .line 378
    const/4 v2, 0x3

    .line 379
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 384
    .line 385
    .line 386
    check-cast v1, Landroid/app/Dialog;

    .line 387
    .line 388
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_9

    .line 393
    .line 394
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 395
    .line 396
    .line 397
    :cond_9
    monitor-enter v5

    .line 398
    :try_start_1
    iget-object v0, v5, Lcom/google/android/gms/common/api/internal/k0;->a:Landroid/content/Context;

    .line 399
    .line 400
    if-eqz v0, :cond_a

    .line 401
    .line 402
    invoke-virtual {v0, v5}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 403
    .line 404
    .line 405
    :cond_a
    iput-object v3, v5, Lcom/google/android/gms/common/api/internal/k0;->a:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 406
    .line 407
    monitor-exit v5

    .line 408
    goto :goto_2

    .line 409
    :catchall_0
    move-exception v0

    .line 410
    monitor-exit v5

    .line 411
    throw v0

    .line 412
    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 415
    .line 416
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v2, Lcom/google/android/gms/common/api/internal/c1;

    .line 419
    .line 420
    iget v2, v2, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 421
    .line 422
    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 423
    .line 424
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 428
    .line 429
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/h;->h(Lb5/a;I)V

    .line 430
    .line 431
    .line 432
    :cond_c
    :goto_2
    return-void

    .line 433
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/t0;->c:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, Lcom/google/android/gms/common/api/internal/r0;

    .line 436
    .line 437
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/t0;->b:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v5, Lr5/h;

    .line 440
    .line 441
    sget-object v6, Lcom/google/android/gms/common/api/internal/r0;->h:Ls4/g;

    .line 442
    .line 443
    iget-object v6, v5, Lr5/h;->b:Lb5/a;

    .line 444
    .line 445
    iget v7, v6, Lb5/a;->b:I

    .line 446
    .line 447
    if-nez v7, :cond_d

    .line 448
    .line 449
    move v7, v4

    .line 450
    goto :goto_4

    .line 451
    :cond_d
    move v7, v2

    .line 452
    :goto_4
    if-eqz v7, :cond_14

    .line 453
    .line 454
    iget-object v5, v5, Lr5/h;->c:Lcom/google/android/gms/common/internal/c0;

    .line 455
    .line 456
    invoke-static {v5}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    iget-object v6, v5, Lcom/google/android/gms/common/internal/c0;->c:Lb5/a;

    .line 460
    .line 461
    iget v7, v6, Lb5/a;->b:I

    .line 462
    .line 463
    if-nez v7, :cond_e

    .line 464
    .line 465
    move v2, v4

    .line 466
    :cond_e
    if-nez v2, :cond_f

    .line 467
    .line 468
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    new-instance v2, Ljava/lang/Exception;

    .line 473
    .line 474
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 475
    .line 476
    .line 477
    const-string v3, "Sign-in succeeded with resolve account failure: "

    .line 478
    .line 479
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    const-string v3, "SignInCoordinator"

    .line 484
    .line 485
    invoke-static {v3, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 486
    .line 487
    .line 488
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 489
    .line 490
    invoke-virtual {v1, v6}, Lcom/google/android/gms/common/api/internal/i0;->e(Lb5/a;)V

    .line 491
    .line 492
    .line 493
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 494
    .line 495
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 496
    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_f
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 500
    .line 501
    iget-object v4, v5, Lcom/google/android/gms/common/internal/c0;->b:Landroid/os/IBinder;

    .line 502
    .line 503
    if-nez v4, :cond_10

    .line 504
    .line 505
    goto :goto_5

    .line 506
    :cond_10
    sget v3, Lcom/google/android/gms/common/internal/a;->a:I

    .line 507
    .line 508
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 509
    .line 510
    invoke-interface {v4, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    instance-of v5, v3, Lcom/google/android/gms/common/internal/m;

    .line 515
    .line 516
    if-eqz v5, :cond_11

    .line 517
    .line 518
    check-cast v3, Lcom/google/android/gms/common/internal/m;

    .line 519
    .line 520
    goto :goto_5

    .line 521
    :cond_11
    new-instance v3, Lcom/google/android/gms/common/internal/s0;

    .line 522
    .line 523
    invoke-direct {v3, v4}, Lcom/google/android/gms/common/internal/s0;-><init>(Landroid/os/IBinder;)V

    .line 524
    .line 525
    .line 526
    :goto_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    if-eqz v3, :cond_13

    .line 530
    .line 531
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/r0;->d:Ljava/util/Set;

    .line 532
    .line 533
    if-nez v4, :cond_12

    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_12
    iput-object v3, v2, Lcom/google/android/gms/common/api/internal/i0;->d:Ljava/lang/Object;

    .line 537
    .line 538
    iput-object v4, v2, Lcom/google/android/gms/common/api/internal/i0;->e:Ljava/lang/Object;

    .line 539
    .line 540
    iget-boolean v1, v2, Lcom/google/android/gms/common/api/internal/i0;->a:Z

    .line 541
    .line 542
    if-eqz v1, :cond_15

    .line 543
    .line 544
    check-cast v3, Lcom/google/android/gms/common/internal/m;

    .line 545
    .line 546
    iget-object v1, v2, Lcom/google/android/gms/common/api/internal/i0;->b:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v1, Lcom/google/android/gms/common/api/g;

    .line 549
    .line 550
    check-cast v4, Ljava/util/Set;

    .line 551
    .line 552
    invoke-interface {v1, v3, v4}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V

    .line 553
    .line 554
    .line 555
    goto :goto_7

    .line 556
    :cond_13
    :goto_6
    new-instance v3, Ljava/lang/Exception;

    .line 557
    .line 558
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 559
    .line 560
    .line 561
    const-string v4, "Received null response from onSignInSuccess"

    .line 562
    .line 563
    invoke-static {v1, v4, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 564
    .line 565
    .line 566
    new-instance v1, Lb5/a;

    .line 567
    .line 568
    const/4 v3, 0x4

    .line 569
    invoke-direct {v1, v3}, Lb5/a;-><init>(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/i0;->e(Lb5/a;)V

    .line 573
    .line 574
    .line 575
    goto :goto_7

    .line 576
    :cond_14
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 577
    .line 578
    invoke-virtual {v1, v6}, Lcom/google/android/gms/common/api/internal/i0;->e(Lb5/a;)V

    .line 579
    .line 580
    .line 581
    :cond_15
    :goto_7
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 582
    .line 583
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 584
    .line 585
    .line 586
    :goto_8
    return-void

    .line 587
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
