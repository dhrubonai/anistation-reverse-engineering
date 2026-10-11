.class public final Landroidx/appcompat/widget/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/j;->a:I

    iput-object p2, p0, Landroidx/appcompat/widget/j;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/appcompat/widget/j;->a:I

    iput-object p1, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/appcompat/widget/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/j;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Landroidx/appcompat/widget/j;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto/16 :goto_7

    .line 11
    .line 12
    :cond_0
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Runnable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    sget-object v4, Lz6/j;->a:Lz6/j;

    .line 22
    .line 23
    invoke-static {v4, v0}, Lq6/g;->C(Lz6/i;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    move-object v0, v3

    .line 27
    check-cast v0, Lt7/k;

    .line 28
    .line 29
    sget-object v4, Lt7/k;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {v0}, Lt7/k;->I()Ljava/lang/Runnable;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iput-object v4, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 39
    .line 40
    add-int/2addr v1, v2

    .line 41
    const/16 v4, 0x10

    .line 42
    .line 43
    if-lt v1, v4, :cond_0

    .line 44
    .line 45
    iget-object v4, v0, Lt7/k;->c:Lp7/w;

    .line 46
    .line 47
    invoke-virtual {v4}, Lp7/w;->H()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-virtual {v4, v0, p0}, Lp7/w;->G(Lz6/i;Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :pswitch_1
    check-cast v3, La4/a;

    .line 58
    .line 59
    iget-boolean v0, v3, La4/a;->d:Z

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 64
    .line 65
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    :try_start_1
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Runnable;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    iget-object v1, v3, La4/a;->c:La4/b;

    .line 93
    .line 94
    check-cast v1, Lw1/o;

    .line 95
    .line 96
    iget v1, v1, Lw1/o;->a:I

    .line 97
    .line 98
    const-string v2, "Request threw uncaught throwable"

    .line 99
    .line 100
    packed-switch v1, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :pswitch_2
    const/4 v1, 0x6

    .line 105
    const-string v3, "GlideExecutor"

    .line 106
    .line 107
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_3

    .line 112
    .line 113
    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_2
    :pswitch_3
    return-void

    .line 117
    :goto_3
    new-instance v1, Ljava/lang/RuntimeException;

    .line 118
    .line 119
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw v1

    .line 123
    :pswitch_4
    const/16 v0, 0xa

    .line 124
    .line 125
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/lang/Runnable;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_5
    :try_start_2
    sget-object v0, Lw/i;->d:Ljava/lang/reflect/Method;

    .line 137
    .line 138
    const/4 v4, 0x2

    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    iget-object v5, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 142
    .line 143
    const/4 v6, 0x3

    .line 144
    new-array v6, v6, [Ljava/lang/Object;

    .line 145
    .line 146
    aput-object v3, v6, v1

    .line 147
    .line 148
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    aput-object v1, v6, v2

    .line 151
    .line 152
    const-string v1, "AppCompat recreation"

    .line 153
    .line 154
    aput-object v1, v6, v4

    .line 155
    .line 156
    invoke-virtual {v0, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_4
    sget-object v0, Lw/i;->e:Ljava/lang/reflect/Method;

    .line 161
    .line 162
    iget-object v5, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 163
    .line 164
    new-array v4, v4, [Ljava/lang/Object;

    .line 165
    .line 166
    aput-object v3, v4, v1

    .line 167
    .line 168
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 169
    .line 170
    aput-object v1, v4, v2

    .line 171
    .line 172
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :catchall_2
    move-exception v0

    .line 177
    const-string v1, "ActivityRecreator"

    .line 178
    .line 179
    const-string v2, "Exception while invoking performStopActivity"

    .line 180
    .line 181
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :catch_0
    move-exception v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-class v2, Ljava/lang/RuntimeException;

    .line 191
    .line 192
    if-ne v1, v2, :cond_6

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v2, "Unable to stop"

    .line 205
    .line 206
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-nez v1, :cond_5

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_5
    throw v0

    .line 214
    :cond_6
    :goto_4
    return-void

    .line 215
    :pswitch_6
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Landroid/app/Application;

    .line 218
    .line 219
    check-cast v3, Lw/h;

    .line 220
    .line 221
    invoke-virtual {v0, v3}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_7
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Lw/h;

    .line 228
    .line 229
    iput-object v3, v0, Lw/h;->a:Ljava/lang/Object;

    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_8
    check-cast v3, Landroidx/appcompat/widget/m;

    .line 233
    .line 234
    iget-object v0, v3, Landroidx/appcompat/widget/m;->c:Lj/o;

    .line 235
    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    iget-object v4, v0, Lj/o;->e:Lj/m;

    .line 239
    .line 240
    if-eqz v4, :cond_7

    .line 241
    .line 242
    invoke-interface {v4, v0}, Lj/m;->p(Lj/o;)V

    .line 243
    .line 244
    .line 245
    :cond_7
    iget-object v0, v3, Landroidx/appcompat/widget/m;->y:Lj/e0;

    .line 246
    .line 247
    check-cast v0, Landroid/view/View;

    .line 248
    .line 249
    if-eqz v0, :cond_a

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-eqz v0, :cond_a

    .line 256
    .line 257
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Landroidx/appcompat/widget/h;

    .line 260
    .line 261
    invoke-virtual {v0}, Lj/a0;->b()Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_8

    .line 266
    .line 267
    :goto_5
    move v1, v2

    .line 268
    goto :goto_6

    .line 269
    :cond_8
    iget-object v4, v0, Lj/a0;->f:Landroid/view/View;

    .line 270
    .line 271
    if-nez v4, :cond_9

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_9
    invoke-virtual {v0, v1, v1, v1, v1}, Lj/a0;->d(IIZZ)V

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :goto_6
    if-eqz v1, :cond_a

    .line 279
    .line 280
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Landroidx/appcompat/widget/h;

    .line 283
    .line 284
    iput-object v0, v3, Landroidx/appcompat/widget/m;->J:Landroidx/appcompat/widget/h;

    .line 285
    .line 286
    :cond_a
    const/4 v0, 0x0

    .line 287
    iput-object v0, v3, Landroidx/appcompat/widget/m;->L:Landroidx/appcompat/widget/j;

    .line 288
    .line 289
    return-void

    .line 290
    :goto_7
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Landroid/widget/TextView;

    .line 293
    .line 294
    check-cast v3, Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Landroid/widget/TextView;

    .line 306
    .line 307
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 312
    .line 313
    .line 314
    iget-object v0, p0, Landroidx/appcompat/widget/j;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Landroid/widget/TextView;

    .line 317
    .line 318
    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :pswitch_data_1
    .packed-switch 0x18
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
