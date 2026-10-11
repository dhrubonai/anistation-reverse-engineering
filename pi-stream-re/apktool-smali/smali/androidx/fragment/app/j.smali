.class public final Landroidx/fragment/app/j;
.super Lf/d0;
.source "SourceFile"


# instance fields
.field public final c:Z

.field public d:Z

.field public e:Landroidx/fragment/app/c0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m1;Lc0/d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/j;->d:Z

    .line 6
    .line 7
    iput-boolean p3, p0, Landroidx/fragment/app/j;->c:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h(Landroid/content/Context;)Landroidx/fragment/app/c0;
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/j;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/j;->e:Landroidx/fragment/app/c0;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lf/d0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroidx/fragment/app/m1;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 13
    .line 14
    iget v0, v0, Landroidx/fragment/app/m1;->a:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v0, v3, :cond_1

    .line 20
    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    :goto_0
    iget-object v3, v1, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move v5, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iget v5, v3, Landroidx/fragment/app/v;->f:I

    .line 31
    .line 32
    :goto_1
    iget-boolean v6, p0, Landroidx/fragment/app/j;->c:Z

    .line 33
    .line 34
    if-eqz v6, :cond_6

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    :goto_2
    move v3, v2

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    iget v3, v3, Landroidx/fragment/app/v;->d:I

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_4
    if-nez v3, :cond_5

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_5
    iget v3, v3, Landroidx/fragment/app/v;->e:I

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_6
    if-eqz v0, :cond_8

    .line 52
    .line 53
    if-nez v3, :cond_7

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_7
    iget v3, v3, Landroidx/fragment/app/v;->b:I

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_8
    if-nez v3, :cond_9

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_9
    iget v3, v3, Landroidx/fragment/app/v;->c:I

    .line 63
    .line 64
    :goto_3
    invoke-virtual {v1, v2, v2, v2, v2}, Landroidx/fragment/app/y;->R(IIII)V

    .line 65
    .line 66
    .line 67
    iget-object v6, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    if-eqz v6, :cond_a

    .line 71
    .line 72
    const v8, 0x7f0a020c

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_a

    .line 80
    .line 81
    iget-object v6, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-virtual {v6, v8, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_a
    iget-object v1, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 87
    .line 88
    if-eqz v1, :cond_b

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_b

    .line 95
    .line 96
    goto/16 :goto_6

    .line 97
    .line 98
    :cond_b
    if-nez v3, :cond_16

    .line 99
    .line 100
    if-eqz v5, :cond_16

    .line 101
    .line 102
    const/16 v1, 0x1001

    .line 103
    .line 104
    if-eq v5, v1, :cond_14

    .line 105
    .line 106
    const/16 v1, 0x2002

    .line 107
    .line 108
    if-eq v5, v1, :cond_12

    .line 109
    .line 110
    const/16 v1, 0x2005

    .line 111
    .line 112
    if-eq v5, v1, :cond_10

    .line 113
    .line 114
    const/16 v1, 0x1003

    .line 115
    .line 116
    if-eq v5, v1, :cond_e

    .line 117
    .line 118
    const/16 v1, 0x1004

    .line 119
    .line 120
    if-eq v5, v1, :cond_c

    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    goto :goto_4

    .line 124
    :cond_c
    if-eqz v0, :cond_d

    .line 125
    .line 126
    const v0, 0x10100b8

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0}, Lj5/a;->f0(Landroid/content/Context;I)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    goto :goto_4

    .line 134
    :cond_d
    const v0, 0x10100b9

    .line 135
    .line 136
    .line 137
    invoke-static {p1, v0}, Lj5/a;->f0(Landroid/content/Context;I)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    goto :goto_4

    .line 142
    :cond_e
    if-eqz v0, :cond_f

    .line 143
    .line 144
    const v0, 0x7f020005

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_f
    const v0, 0x7f020006

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_10
    if-eqz v0, :cond_11

    .line 153
    .line 154
    const v0, 0x10100ba

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v0}, Lj5/a;->f0(Landroid/content/Context;I)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    goto :goto_4

    .line 162
    :cond_11
    const v0, 0x10100bb

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v0}, Lj5/a;->f0(Landroid/content/Context;I)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    goto :goto_4

    .line 170
    :cond_12
    if-eqz v0, :cond_13

    .line 171
    .line 172
    const v0, 0x7f020003

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_13
    const v0, 0x7f020004

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_14
    if-eqz v0, :cond_15

    .line 181
    .line 182
    const v0, 0x7f020007

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_15
    const v0, 0x7f020008

    .line 187
    .line 188
    .line 189
    :goto_4
    move v3, v0

    .line 190
    :cond_16
    if-eqz v3, :cond_1a

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v1, "anim"

    .line 201
    .line 202
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_18

    .line 207
    .line 208
    :try_start_0
    invoke-static {p1, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-eqz v1, :cond_17

    .line 213
    .line 214
    new-instance v5, Landroidx/fragment/app/c0;

    .line 215
    .line 216
    invoke-direct {v5, v1}, Landroidx/fragment/app/c0;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 217
    .line 218
    .line 219
    move-object v7, v5

    .line 220
    goto :goto_6

    .line 221
    :cond_17
    move v2, v4

    .line 222
    goto :goto_5

    .line 223
    :catch_0
    move-exception p1

    .line 224
    throw p1

    .line 225
    :catch_1
    :cond_18
    :goto_5
    if-nez v2, :cond_1a

    .line 226
    .line 227
    :try_start_1
    invoke-static {p1, v3}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-eqz v1, :cond_1a

    .line 232
    .line 233
    new-instance v2, Landroidx/fragment/app/c0;

    .line 234
    .line 235
    invoke-direct {v2, v1}, Landroidx/fragment/app/c0;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 236
    .line 237
    .line 238
    move-object v7, v2

    .line 239
    goto :goto_6

    .line 240
    :catch_2
    move-exception v1

    .line 241
    if-nez v0, :cond_19

    .line 242
    .line 243
    invoke-static {p1, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-eqz p1, :cond_1a

    .line 248
    .line 249
    new-instance v7, Landroidx/fragment/app/c0;

    .line 250
    .line 251
    invoke-direct {v7, p1}, Landroidx/fragment/app/c0;-><init>(Landroid/view/animation/Animation;)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_19
    throw v1

    .line 256
    :cond_1a
    :goto_6
    iput-object v7, p0, Landroidx/fragment/app/j;->e:Landroidx/fragment/app/c0;

    .line 257
    .line 258
    iput-boolean v4, p0, Landroidx/fragment/app/j;->d:Z

    .line 259
    .line 260
    return-object v7
.end method
