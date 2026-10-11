.class public abstract Landroidx/lifecycle/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/x;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/x;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p1, v0, v1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "{\n            constructo\u2026tance(`object`)\n        }"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, La3/g;->C(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    :catch_0
    move-exception p0

    .line 22
    new-instance p1, Ljava/lang/RuntimeException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :catch_1
    move-exception p0

    .line 29
    new-instance p1, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :catch_2
    move-exception p0

    .line 36
    new-instance p1, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public static b(Ljava/lang/Class;)I
    .locals 12

    .line 1
    sget-object v0, Landroidx/lifecycle/x;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_d

    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v4, ""

    .line 43
    .line 44
    :goto_0
    const-string v6, "fullPackage"

    .line 45
    .line 46
    invoke-static {v4, v6}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_3

    .line 54
    .line 55
    move v6, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v6, v1

    .line 58
    :goto_1
    if-eqz v6, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const-string v6, "name"

    .line 62
    .line 63
    invoke-static {v5, v6}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    add-int/2addr v6, v2

    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v6, "this as java.lang.String).substring(startIndex)"

    .line 76
    .line 77
    invoke-static {v5, v6}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    const-string v6, "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)"

    .line 81
    .line 82
    invoke-static {v5, v6}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v6, "."

    .line 86
    .line 87
    const-string v7, "_"

    .line 88
    .line 89
    invoke-static {v5, v6, v7}, Lo7/j;->y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "_LifecycleAdapter"

    .line 94
    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_5

    .line 104
    .line 105
    move v6, v2

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    move v6, v1

    .line 108
    :goto_3
    if-eqz v6, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    new-instance v6, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const/16 v4, 0x2e

    .line 120
    .line 121
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    :goto_4
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    new-array v5, v2, [Ljava/lang/Class;

    .line 136
    .line 137
    aput-object p0, v5, v1

    .line 138
    .line 139
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_7

    .line 148
    .line 149
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :catch_0
    move-exception p0

    .line 154
    new-instance v0, Ljava/lang/RuntimeException;

    .line 155
    .line 156
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :catch_1
    move-object v4, v3

    .line 161
    :cond_7
    :goto_5
    sget-object v5, Landroidx/lifecycle/x;->b:Ljava/util/HashMap;

    .line 162
    .line 163
    if-eqz v4, :cond_8

    .line 164
    .line 165
    invoke-static {v4}, Lcom/bumptech/glide/c;->L(Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto/16 :goto_c

    .line 173
    .line 174
    :cond_8
    sget-object v4, Landroidx/lifecycle/d;->c:Landroidx/lifecycle/d;

    .line 175
    .line 176
    iget-object v6, v4, Landroidx/lifecycle/d;->b:Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-virtual {v6, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, Ljava/lang/Boolean;

    .line 183
    .line 184
    if-eqz v7, :cond_9

    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    goto :goto_7

    .line 191
    :cond_9
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 192
    .line 193
    .line 194
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2

    .line 195
    array-length v8, v7

    .line 196
    move v9, v1

    .line 197
    :goto_6
    if-ge v9, v8, :cond_b

    .line 198
    .line 199
    aget-object v10, v7, v9

    .line 200
    .line 201
    const-class v11, Landroidx/lifecycle/e0;

    .line 202
    .line 203
    invoke-virtual {v10, v11}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    check-cast v10, Landroidx/lifecycle/e0;

    .line 208
    .line 209
    if-eqz v10, :cond_a

    .line 210
    .line 211
    invoke-virtual {v4, p0, v7}, Landroidx/lifecycle/d;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Landroidx/lifecycle/b;

    .line 212
    .line 213
    .line 214
    move v4, v2

    .line 215
    goto :goto_7

    .line 216
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_b
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v6, p0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move v4, v1

    .line 225
    :goto_7
    if-eqz v4, :cond_c

    .line 226
    .line 227
    goto/16 :goto_d

    .line 228
    .line 229
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    const-class v6, Landroidx/lifecycle/t;

    .line 234
    .line 235
    if-eqz v4, :cond_d

    .line 236
    .line 237
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_d

    .line 242
    .line 243
    move v7, v2

    .line 244
    goto :goto_8

    .line 245
    :cond_d
    move v7, v1

    .line 246
    :goto_8
    if-eqz v7, :cond_f

    .line 247
    .line 248
    const-string v3, "superclass"

    .line 249
    .line 250
    invoke-static {v4, v3}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v4}, Landroidx/lifecycle/x;->b(Ljava/lang/Class;)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-ne v3, v2, :cond_e

    .line 258
    .line 259
    goto :goto_d

    .line 260
    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-static {v4}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    check-cast v4, Ljava/util/Collection;

    .line 270
    .line 271
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 272
    .line 273
    .line 274
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    const-string v7, "klass.interfaces"

    .line 279
    .line 280
    invoke-static {v4, v7}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    array-length v7, v4

    .line 284
    move v8, v1

    .line 285
    :goto_9
    if-ge v8, v7, :cond_14

    .line 286
    .line 287
    aget-object v9, v4, v8

    .line 288
    .line 289
    if-eqz v9, :cond_10

    .line 290
    .line 291
    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-eqz v10, :cond_10

    .line 296
    .line 297
    move v10, v2

    .line 298
    goto :goto_a

    .line 299
    :cond_10
    move v10, v1

    .line 300
    :goto_a
    if-nez v10, :cond_11

    .line 301
    .line 302
    goto :goto_b

    .line 303
    :cond_11
    const-string v10, "intrface"

    .line 304
    .line 305
    invoke-static {v9, v10}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v9}, Landroidx/lifecycle/x;->b(Ljava/lang/Class;)I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-ne v10, v2, :cond_12

    .line 313
    .line 314
    goto :goto_d

    .line 315
    :cond_12
    if-nez v3, :cond_13

    .line 316
    .line 317
    new-instance v3, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    :cond_13
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-static {v9}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    check-cast v9, Ljava/util/Collection;

    .line 330
    .line 331
    invoke-interface {v3, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 332
    .line 333
    .line 334
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_14
    if-eqz v3, :cond_15

    .line 338
    .line 339
    invoke-virtual {v5, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    :goto_c
    const/4 v2, 0x2

    .line 343
    :cond_15
    :goto_d
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    return v2

    .line 351
    :catch_2
    move-exception p0

    .line 352
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 353
    .line 354
    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    .line 355
    .line 356
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    throw v0
.end method
