.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:I

.field public G:[I

.field public H:[Landroid/view/View;

.field public final I:Landroid/util/SparseIntArray;

.field public final J:Landroid/util/SparseIntArray;

.field public final K:Landroidx/appcompat/widget/x3;

.field public final L:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    .line 18
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    const/4 v0, -0x1

    .line 20
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 21
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 22
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 23
    new-instance v0, Landroidx/appcompat/widget/x3;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/x3;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 24
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    const/4 v0, 0x2

    .line 25
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    const/4 v0, -0x1

    .line 12
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 13
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 14
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 15
    new-instance v0, Landroidx/appcompat/widget/x3;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/x3;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 16
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 17
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 4
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 5
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 6
    new-instance v0, Landroidx/appcompat/widget/x3;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/x3;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 8
    invoke-static {p1, p2, p3, p4}, Lm3/k0;->G(Landroid/content/Context;Landroid/util/AttributeSet;II)Lm3/j0;

    move-result-object p1

    .line 9
    iget p1, p1, Lm3/j0;->b:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->k1(I)V

    return-void
.end method


# virtual methods
.method public final A0(Lm3/w0;Lm3/u;Ln/g;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 6
    .line 7
    if-ge v2, v3, :cond_1

    .line 8
    .line 9
    iget v3, p2, Lm3/u;->d:I

    .line 10
    .line 11
    if-ltz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lm3/w0;->b()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v3, v4, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v3, v1

    .line 22
    :goto_1
    if-eqz v3, :cond_1

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    iget v3, p2, Lm3/u;->d:I

    .line 27
    .line 28
    iget v4, p2, Lm3/u;->g:I

    .line 29
    .line 30
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p3, v3, v4}, Ln/g;->b(II)V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    iget v3, p2, Lm3/u;->d:I

    .line 45
    .line 46
    iget v4, p2, Lm3/u;->e:I

    .line 47
    .line 48
    add-int/2addr v3, v4

    .line 49
    iput v3, p2, Lm3/u;->d:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method public final H(La3/h;Lm3/w0;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int/2addr v0, v1

    .line 22
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->g1(ILa3/h;Lm3/w0;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/2addr p1, v1

    .line 27
    return p1
.end method

.method public final N0(La3/h;Lm3/w0;ZZ)Landroid/view/View;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    sub-int/2addr p3, v0

    .line 13
    const/4 p4, -0x1

    .line 14
    move v0, p4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p4, 0x0

    .line 17
    move v8, p4

    .line 18
    move p4, p3

    .line 19
    move p3, v8

    .line 20
    :goto_0
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 28
    .line 29
    invoke-virtual {v2}, Lm3/y;->h()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 34
    .line 35
    invoke-virtual {v3}, Lm3/y;->f()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    move-object v5, v4

    .line 41
    :goto_1
    if-eq p3, p4, :cond_6

    .line 42
    .line 43
    invoke-virtual {p0, p3}, Lm3/k0;->u(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Lm3/k0;->F(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-ltz v7, :cond_5

    .line 52
    .line 53
    if-ge v7, v1, :cond_5

    .line 54
    .line 55
    invoke-virtual {p0, v7, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(ILa3/h;Lm3/w0;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lm3/l0;

    .line 67
    .line 68
    invoke-virtual {v7}, Lm3/l0;->c()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    if-nez v5, :cond_5

    .line 75
    .line 76
    move-object v5, v6

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 79
    .line 80
    invoke-virtual {v7, v6}, Lm3/y;->d(Landroid/view/View;)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-ge v7, v3, :cond_4

    .line 85
    .line 86
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 87
    .line 88
    invoke-virtual {v7, v6}, Lm3/y;->b(Landroid/view/View;)I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-ge v7, v2, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    return-object v6

    .line 96
    :cond_4
    :goto_2
    if-nez v4, :cond_5

    .line 97
    .line 98
    move-object v4, v6

    .line 99
    :cond_5
    :goto_3
    add-int/2addr p3, v0

    .line 100
    goto :goto_1

    .line 101
    :cond_6
    if-eqz v4, :cond_7

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    move-object v4, v5

    .line 105
    :goto_4
    return-object v4
.end method

.method public final Q(Landroid/view/View;ILa3/h;Lm3/w0;)Landroid/view/View;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    :goto_0
    move-object v3, v4

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    move-object/from16 v5, p1

    .line 17
    .line 18
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    :goto_1
    goto :goto_0

    .line 25
    :cond_1
    iget-object v6, v0, Lm3/k0;->a:Lm3/c;

    .line 26
    .line 27
    invoke-virtual {v6, v3}, Lm3/c;->j(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_2
    if-nez v3, :cond_3

    .line 35
    .line 36
    return-object v4

    .line 37
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lm3/r;

    .line 42
    .line 43
    iget v7, v6, Lm3/r;->e:I

    .line 44
    .line 45
    iget v6, v6, Lm3/r;->f:I

    .line 46
    .line 47
    add-int/2addr v6, v7

    .line 48
    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(Landroid/view/View;ILa3/h;Lm3/w0;)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-nez v5, :cond_4

    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_4
    move/from16 v5, p2

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/4 v8, 0x1

    .line 62
    if-ne v5, v8, :cond_5

    .line 63
    .line 64
    move v5, v8

    .line 65
    goto :goto_3

    .line 66
    :cond_5
    const/4 v5, 0x0

    .line 67
    :goto_3
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 68
    .line 69
    if-eq v5, v10, :cond_6

    .line 70
    .line 71
    move v5, v8

    .line 72
    goto :goto_4

    .line 73
    :cond_6
    const/4 v5, 0x0

    .line 74
    :goto_4
    const/4 v10, -0x1

    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    sub-int/2addr v5, v8

    .line 82
    move v11, v10

    .line 83
    move v12, v11

    .line 84
    goto :goto_5

    .line 85
    :cond_7
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    move v11, v5

    .line 90
    move v12, v8

    .line 91
    const/4 v5, 0x0

    .line 92
    :goto_5
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 93
    .line 94
    if-ne v13, v8, :cond_8

    .line 95
    .line 96
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_8

    .line 101
    .line 102
    move v13, v8

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/4 v13, 0x0

    .line 105
    :goto_6
    invoke-virtual {v0, v5, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->g1(ILa3/h;Lm3/w0;)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    move v9, v10

    .line 110
    move v15, v9

    .line 111
    move/from16 v16, v12

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    move v10, v5

    .line 116
    move-object v5, v4

    .line 117
    :goto_7
    if-eq v10, v11, :cond_1a

    .line 118
    .line 119
    move/from16 v17, v11

    .line 120
    .line 121
    invoke-virtual {v0, v10, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->g1(ILa3/h;Lm3/w0;)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-virtual {v0, v10}, Lm3/k0;->u(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-ne v1, v3, :cond_9

    .line 130
    .line 131
    goto/16 :goto_10

    .line 132
    .line 133
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 134
    .line 135
    .line 136
    move-result v18

    .line 137
    if-eqz v18, :cond_b

    .line 138
    .line 139
    if-eq v11, v14, :cond_b

    .line 140
    .line 141
    if-eqz v4, :cond_a

    .line 142
    .line 143
    goto/16 :goto_10

    .line 144
    .line 145
    :cond_a
    move-object/from16 v18, v3

    .line 146
    .line 147
    move-object/from16 v21, v5

    .line 148
    .line 149
    move/from16 v19, v8

    .line 150
    .line 151
    const/16 v20, 0x1

    .line 152
    .line 153
    goto/16 :goto_e

    .line 154
    .line 155
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    check-cast v11, Lm3/r;

    .line 160
    .line 161
    iget v2, v11, Lm3/r;->e:I

    .line 162
    .line 163
    move-object/from16 v18, v3

    .line 164
    .line 165
    iget v3, v11, Lm3/r;->f:I

    .line 166
    .line 167
    add-int/2addr v3, v2

    .line 168
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 169
    .line 170
    .line 171
    move-result v19

    .line 172
    if-eqz v19, :cond_c

    .line 173
    .line 174
    if-ne v2, v7, :cond_c

    .line 175
    .line 176
    if-ne v3, v6, :cond_c

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 180
    .line 181
    .line 182
    move-result v19

    .line 183
    if-eqz v19, :cond_d

    .line 184
    .line 185
    if-eqz v4, :cond_e

    .line 186
    .line 187
    :cond_d
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 188
    .line 189
    .line 190
    move-result v19

    .line 191
    if-nez v19, :cond_f

    .line 192
    .line 193
    if-nez v5, :cond_f

    .line 194
    .line 195
    :cond_e
    move-object/from16 v21, v5

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_f
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 199
    .line 200
    .line 201
    move-result v19

    .line 202
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 203
    .line 204
    .line 205
    move-result v20

    .line 206
    move-object/from16 v21, v5

    .line 207
    .line 208
    sub-int v5, v20, v19

    .line 209
    .line 210
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 211
    .line 212
    .line 213
    move-result v19

    .line 214
    if-eqz v19, :cond_12

    .line 215
    .line 216
    if-le v5, v8, :cond_10

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_10
    if-ne v5, v8, :cond_16

    .line 220
    .line 221
    if-le v2, v15, :cond_11

    .line 222
    .line 223
    const/4 v5, 0x1

    .line 224
    goto :goto_8

    .line 225
    :cond_11
    const/4 v5, 0x0

    .line 226
    :goto_8
    if-ne v13, v5, :cond_16

    .line 227
    .line 228
    :goto_9
    move/from16 v19, v8

    .line 229
    .line 230
    const/4 v5, 0x1

    .line 231
    const/16 v20, 0x1

    .line 232
    .line 233
    goto :goto_d

    .line 234
    :cond_12
    if-nez v4, :cond_16

    .line 235
    .line 236
    move/from16 v19, v8

    .line 237
    .line 238
    iget-object v8, v0, Lm3/k0;->c:Lm3/m1;

    .line 239
    .line 240
    invoke-virtual {v8, v1}, Lm3/m1;->h(Landroid/view/View;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-eqz v8, :cond_13

    .line 245
    .line 246
    iget-object v8, v0, Lm3/k0;->d:Lm3/m1;

    .line 247
    .line 248
    invoke-virtual {v8, v1}, Lm3/m1;->h(Landroid/view/View;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_13

    .line 253
    .line 254
    const/4 v8, 0x1

    .line 255
    goto :goto_a

    .line 256
    :cond_13
    const/4 v8, 0x0

    .line 257
    :goto_a
    const/16 v20, 0x1

    .line 258
    .line 259
    xor-int/lit8 v8, v8, 0x1

    .line 260
    .line 261
    if-eqz v8, :cond_17

    .line 262
    .line 263
    if-le v5, v12, :cond_14

    .line 264
    .line 265
    goto :goto_c

    .line 266
    :cond_14
    if-ne v5, v12, :cond_17

    .line 267
    .line 268
    if-le v2, v9, :cond_15

    .line 269
    .line 270
    move/from16 v5, v20

    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_15
    const/4 v5, 0x0

    .line 274
    :goto_b
    if-ne v13, v5, :cond_17

    .line 275
    .line 276
    :goto_c
    move/from16 v5, v20

    .line 277
    .line 278
    goto :goto_d

    .line 279
    :cond_16
    move/from16 v19, v8

    .line 280
    .line 281
    const/16 v20, 0x1

    .line 282
    .line 283
    :cond_17
    const/4 v5, 0x0

    .line 284
    :goto_d
    if-eqz v5, :cond_19

    .line 285
    .line 286
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_18

    .line 291
    .line 292
    iget v4, v11, Lm3/r;->e:I

    .line 293
    .line 294
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    sub-int v8, v3, v2

    .line 303
    .line 304
    move v15, v4

    .line 305
    move-object/from16 v5, v21

    .line 306
    .line 307
    move-object v4, v1

    .line 308
    goto :goto_f

    .line 309
    :cond_18
    iget v5, v11, Lm3/r;->e:I

    .line 310
    .line 311
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    sub-int v12, v3, v2

    .line 320
    .line 321
    move v9, v5

    .line 322
    move/from16 v8, v19

    .line 323
    .line 324
    move-object v5, v1

    .line 325
    goto :goto_f

    .line 326
    :cond_19
    :goto_e
    move/from16 v8, v19

    .line 327
    .line 328
    move-object/from16 v5, v21

    .line 329
    .line 330
    :goto_f
    add-int v10, v10, v16

    .line 331
    .line 332
    move-object/from16 v1, p3

    .line 333
    .line 334
    move-object/from16 v2, p4

    .line 335
    .line 336
    move/from16 v11, v17

    .line 337
    .line 338
    move-object/from16 v3, v18

    .line 339
    .line 340
    goto/16 :goto_7

    .line 341
    .line 342
    :cond_1a
    :goto_10
    move-object/from16 v21, v5

    .line 343
    .line 344
    if-eqz v4, :cond_1b

    .line 345
    .line 346
    goto :goto_11

    .line 347
    :cond_1b
    move-object/from16 v4, v21

    .line 348
    .line 349
    :goto_11
    return-object v4
.end method

.method public final S(La3/h;Lm3/w0;Lh0/h;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lm3/k0;->S(La3/h;Lm3/w0;Lh0/h;)V

    .line 2
    .line 3
    .line 4
    const-class p1, Landroid/widget/GridView;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p2, p3, Lh0/h;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final T(La3/h;Lm3/w0;Landroid/view/View;Lh0/h;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lm3/r;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p3, p4}, Lm3/k0;->U(Landroid/view/View;Lh0/h;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    check-cast v0, Lm3/r;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm3/l0;->a()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-virtual {p0, p3, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->g1(ILa3/h;Lm3/w0;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 24
    .line 25
    iget-object p3, p4, Lh0/h;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    iget v1, v0, Lm3/r;->e:I

    .line 30
    .line 31
    iget v2, v0, Lm3/r;->f:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move v3, p1

    .line 37
    invoke-static/range {v1 .. v6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v2, 0x1

    .line 46
    iget v3, v0, Lm3/r;->e:I

    .line 47
    .line 48
    iget v4, v0, Lm3/r;->f:I

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    move v1, p1

    .line 53
    invoke-static/range {v1 .. v6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-void
.end method

.method public final T0(La3/h;Lm3/w0;Lm3/u;Lm3/t;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 12
    .line 13
    iget v6, v5, Lm3/y;->d:I

    .line 14
    .line 15
    iget-object v5, v5, Lm3/z;->a:Lm3/k0;

    .line 16
    .line 17
    packed-switch v6, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_0
    iget v5, v5, Lm3/k0;->m:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :goto_0
    iget v5, v5, Lm3/k0;->l:I

    .line 25
    .line 26
    :goto_1
    const/high16 v7, 0x40000000    # 2.0f

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    if-eq v5, v7, :cond_0

    .line 30
    .line 31
    move v9, v8

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const/4 v9, 0x0

    .line 34
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    if-lez v10, :cond_1

    .line 39
    .line 40
    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 41
    .line 42
    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 43
    .line 44
    aget v10, v10, v11

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const/4 v10, 0x0

    .line 48
    :goto_3
    if-eqz v9, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/GridLayoutManager;->l1()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget v11, v3, Lm3/u;->e:I

    .line 54
    .line 55
    if-ne v11, v8, :cond_3

    .line 56
    .line 57
    move v11, v8

    .line 58
    goto :goto_4

    .line 59
    :cond_3
    const/4 v11, 0x0

    .line 60
    :goto_4
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 61
    .line 62
    if-nez v11, :cond_4

    .line 63
    .line 64
    iget v12, v3, Lm3/u;->d:I

    .line 65
    .line 66
    invoke-virtual {v0, v12, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(ILa3/h;Lm3/w0;)I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    iget v13, v3, Lm3/u;->d:I

    .line 71
    .line 72
    invoke-virtual {v0, v13, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->i1(ILa3/h;Lm3/w0;)I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    add-int/2addr v12, v13

    .line 77
    :cond_4
    const/4 v13, 0x0

    .line 78
    :goto_5
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 79
    .line 80
    if-ge v13, v14, :cond_9

    .line 81
    .line 82
    iget v14, v3, Lm3/u;->d:I

    .line 83
    .line 84
    if-ltz v14, :cond_5

    .line 85
    .line 86
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    if-ge v14, v15, :cond_5

    .line 91
    .line 92
    move v14, v8

    .line 93
    goto :goto_6

    .line 94
    :cond_5
    const/4 v14, 0x0

    .line 95
    :goto_6
    if-eqz v14, :cond_9

    .line 96
    .line 97
    if-lez v12, :cond_9

    .line 98
    .line 99
    iget v14, v3, Lm3/u;->d:I

    .line 100
    .line 101
    invoke-virtual {v0, v14, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->i1(ILa3/h;Lm3/w0;)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    iget v7, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 106
    .line 107
    if-gt v15, v7, :cond_8

    .line 108
    .line 109
    sub-int/2addr v12, v15

    .line 110
    if-gez v12, :cond_6

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_6
    invoke-virtual {v3, v1}, Lm3/u;->b(La3/h;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    if-nez v7, :cond_7

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_7
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 121
    .line 122
    aput-object v7, v14, v13

    .line 123
    .line 124
    add-int/lit8 v13, v13, 0x1

    .line 125
    .line 126
    const/high16 v7, 0x40000000    # 2.0f

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v3, "Item at position "

    .line 134
    .line 135
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v3, " requires "

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v3, " spans but GridLayoutManager has only "

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v3, " spans."

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v1

    .line 172
    :cond_9
    :goto_7
    if-nez v13, :cond_a

    .line 173
    .line 174
    iput-boolean v8, v4, Lm3/t;->b:Z

    .line 175
    .line 176
    return-void

    .line 177
    :cond_a
    const/4 v7, -0x1

    .line 178
    if-eqz v11, :cond_b

    .line 179
    .line 180
    move/from16 v16, v8

    .line 181
    .line 182
    move v14, v13

    .line 183
    const/4 v12, 0x0

    .line 184
    goto :goto_8

    .line 185
    :cond_b
    add-int/lit8 v12, v13, -0x1

    .line 186
    .line 187
    move v14, v7

    .line 188
    move/from16 v16, v14

    .line 189
    .line 190
    :goto_8
    const/4 v15, 0x0

    .line 191
    :goto_9
    if-eq v12, v14, :cond_c

    .line 192
    .line 193
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 194
    .line 195
    aget-object v8, v8, v12

    .line 196
    .line 197
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 198
    .line 199
    .line 200
    move-result-object v17

    .line 201
    move-object/from16 v6, v17

    .line 202
    .line 203
    check-cast v6, Lm3/r;

    .line 204
    .line 205
    invoke-static {v8}, Lm3/k0;->F(Landroid/view/View;)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-virtual {v0, v8, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->i1(ILa3/h;Lm3/w0;)I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    iput v8, v6, Lm3/r;->f:I

    .line 214
    .line 215
    iput v15, v6, Lm3/r;->e:I

    .line 216
    .line 217
    add-int/2addr v15, v8

    .line 218
    add-int v12, v12, v16

    .line 219
    .line 220
    const/4 v8, 0x1

    .line 221
    goto :goto_9

    .line 222
    :cond_c
    const/4 v1, 0x0

    .line 223
    const/4 v2, 0x0

    .line 224
    const/4 v6, 0x0

    .line 225
    :goto_a
    if-ge v2, v13, :cond_13

    .line 226
    .line 227
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 228
    .line 229
    aget-object v8, v8, v2

    .line 230
    .line 231
    iget-object v12, v3, Lm3/u;->k:Ljava/util/List;

    .line 232
    .line 233
    if-nez v12, :cond_e

    .line 234
    .line 235
    if-eqz v11, :cond_d

    .line 236
    .line 237
    const/4 v12, 0x0

    .line 238
    invoke-virtual {v0, v8, v7, v12}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_d
    const/4 v12, 0x0

    .line 243
    invoke-virtual {v0, v8, v12, v12}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 244
    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_e
    const/4 v12, 0x0

    .line 248
    if-eqz v11, :cond_f

    .line 249
    .line 250
    const/4 v14, 0x1

    .line 251
    invoke-virtual {v0, v8, v7, v14}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 252
    .line 253
    .line 254
    goto :goto_b

    .line 255
    :cond_f
    const/4 v14, 0x1

    .line 256
    invoke-virtual {v0, v8, v12, v14}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 257
    .line 258
    .line 259
    :goto_b
    iget-object v14, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    iget-object v15, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:Landroid/graphics/Rect;

    .line 262
    .line 263
    if-nez v14, :cond_10

    .line 264
    .line 265
    invoke-virtual {v15, v12, v12, v12, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 266
    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_10
    invoke-virtual {v14, v8}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroid/graphics/Rect;

    .line 270
    .line 271
    .line 272
    move-result-object v14

    .line 273
    invoke-virtual {v15, v14}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 274
    .line 275
    .line 276
    :goto_c
    invoke-virtual {v0, v8, v5, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(Landroid/view/View;IZ)V

    .line 277
    .line 278
    .line 279
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 280
    .line 281
    invoke-virtual {v12, v8}, Lm3/y;->c(Landroid/view/View;)I

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-le v12, v6, :cond_11

    .line 286
    .line 287
    move v6, v12

    .line 288
    :cond_11
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    check-cast v12, Lm3/r;

    .line 293
    .line 294
    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 295
    .line 296
    invoke-virtual {v14, v8}, Lm3/y;->m(Landroid/view/View;)I

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    int-to-float v8, v8

    .line 301
    const/high16 v14, 0x3f800000    # 1.0f

    .line 302
    .line 303
    mul-float/2addr v8, v14

    .line 304
    iget v12, v12, Lm3/r;->f:I

    .line 305
    .line 306
    int-to-float v12, v12

    .line 307
    div-float/2addr v8, v12

    .line 308
    cmpl-float v12, v8, v1

    .line 309
    .line 310
    if-lez v12, :cond_12

    .line 311
    .line 312
    move v1, v8

    .line 313
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_13
    if-eqz v9, :cond_15

    .line 317
    .line 318
    iget v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 319
    .line 320
    int-to-float v2, v2

    .line 321
    mul-float/2addr v1, v2

    .line 322
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->e1(I)V

    .line 331
    .line 332
    .line 333
    const/4 v6, 0x0

    .line 334
    const/4 v12, 0x0

    .line 335
    :goto_d
    if-ge v12, v13, :cond_15

    .line 336
    .line 337
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 338
    .line 339
    aget-object v1, v1, v12

    .line 340
    .line 341
    const/high16 v2, 0x40000000    # 2.0f

    .line 342
    .line 343
    const/4 v5, 0x1

    .line 344
    invoke-virtual {v0, v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->j1(Landroid/view/View;IZ)V

    .line 345
    .line 346
    .line 347
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 348
    .line 349
    invoke-virtual {v2, v1}, Lm3/y;->c(Landroid/view/View;)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-le v1, v6, :cond_14

    .line 354
    .line 355
    move v6, v1

    .line 356
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 357
    .line 358
    goto :goto_d

    .line 359
    :cond_15
    const/4 v12, 0x0

    .line 360
    :goto_e
    if-ge v12, v13, :cond_19

    .line 361
    .line 362
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 363
    .line 364
    aget-object v1, v1, v12

    .line 365
    .line 366
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 367
    .line 368
    invoke-virtual {v2, v1}, Lm3/y;->c(Landroid/view/View;)I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eq v2, v6, :cond_17

    .line 373
    .line 374
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Lm3/r;

    .line 379
    .line 380
    iget-object v5, v2, Lm3/l0;->b:Landroid/graphics/Rect;

    .line 381
    .line 382
    iget v8, v5, Landroid/graphics/Rect;->top:I

    .line 383
    .line 384
    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    .line 385
    .line 386
    add-int/2addr v8, v9

    .line 387
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 388
    .line 389
    add-int/2addr v8, v9

    .line 390
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 391
    .line 392
    add-int/2addr v8, v9

    .line 393
    iget v9, v5, Landroid/graphics/Rect;->left:I

    .line 394
    .line 395
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 396
    .line 397
    add-int/2addr v9, v5

    .line 398
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 399
    .line 400
    add-int/2addr v9, v5

    .line 401
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 402
    .line 403
    add-int/2addr v9, v5

    .line 404
    iget v5, v2, Lm3/r;->e:I

    .line 405
    .line 406
    iget v10, v2, Lm3/r;->f:I

    .line 407
    .line 408
    invoke-virtual {v0, v5, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->f1(II)I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 413
    .line 414
    const/4 v11, 0x1

    .line 415
    if-ne v10, v11, :cond_16

    .line 416
    .line 417
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    const/high16 v11, 0x40000000    # 2.0f

    .line 421
    .line 422
    invoke-static {v10, v5, v11, v9, v2}, Lm3/k0;->w(ZIIII)I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    sub-int v5, v6, v8

    .line 427
    .line 428
    invoke-static {v5, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    goto :goto_f

    .line 433
    :cond_16
    const/4 v10, 0x0

    .line 434
    const/high16 v11, 0x40000000    # 2.0f

    .line 435
    .line 436
    sub-int v9, v6, v9

    .line 437
    .line 438
    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 443
    .line 444
    invoke-static {v10, v5, v11, v8, v2}, Lm3/k0;->w(ZIIII)I

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    move v2, v9

    .line 449
    :goto_f
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    check-cast v8, Lm3/l0;

    .line 454
    .line 455
    invoke-virtual {v0, v1, v2, v5, v8}, Lm3/k0;->v0(Landroid/view/View;IILm3/l0;)Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    if-eqz v8, :cond_18

    .line 460
    .line 461
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->measure(II)V

    .line 462
    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_17
    const/4 v10, 0x0

    .line 466
    const/high16 v11, 0x40000000    # 2.0f

    .line 467
    .line 468
    :cond_18
    :goto_10
    add-int/lit8 v12, v12, 0x1

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_19
    const/4 v10, 0x0

    .line 472
    iput v6, v4, Lm3/t;->a:I

    .line 473
    .line 474
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 475
    .line 476
    const/4 v2, 0x1

    .line 477
    if-ne v1, v2, :cond_1b

    .line 478
    .line 479
    iget v1, v3, Lm3/u;->f:I

    .line 480
    .line 481
    if-ne v1, v7, :cond_1a

    .line 482
    .line 483
    iget v1, v3, Lm3/u;->b:I

    .line 484
    .line 485
    sub-int v2, v1, v6

    .line 486
    .line 487
    move v12, v2

    .line 488
    goto :goto_11

    .line 489
    :cond_1a
    iget v1, v3, Lm3/u;->b:I

    .line 490
    .line 491
    add-int/2addr v6, v1

    .line 492
    move v12, v1

    .line 493
    move v1, v6

    .line 494
    :goto_11
    move v2, v10

    .line 495
    move v3, v12

    .line 496
    move v12, v1

    .line 497
    move v1, v2

    .line 498
    goto :goto_13

    .line 499
    :cond_1b
    iget v1, v3, Lm3/u;->f:I

    .line 500
    .line 501
    if-ne v1, v7, :cond_1c

    .line 502
    .line 503
    iget v1, v3, Lm3/u;->b:I

    .line 504
    .line 505
    sub-int v2, v1, v6

    .line 506
    .line 507
    move v12, v2

    .line 508
    goto :goto_12

    .line 509
    :cond_1c
    iget v1, v3, Lm3/u;->b:I

    .line 510
    .line 511
    add-int/2addr v6, v1

    .line 512
    move v12, v1

    .line 513
    move v1, v6

    .line 514
    :goto_12
    move v3, v10

    .line 515
    move v2, v12

    .line 516
    move v12, v3

    .line 517
    :goto_13
    move v6, v10

    .line 518
    :goto_14
    if-ge v6, v13, :cond_21

    .line 519
    .line 520
    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 521
    .line 522
    aget-object v5, v5, v6

    .line 523
    .line 524
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    check-cast v7, Lm3/r;

    .line 529
    .line 530
    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 531
    .line 532
    const/4 v9, 0x1

    .line 533
    if-ne v8, v9, :cond_1e

    .line 534
    .line 535
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    if-eqz v1, :cond_1d

    .line 540
    .line 541
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->C()I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 546
    .line 547
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 548
    .line 549
    iget v9, v7, Lm3/r;->e:I

    .line 550
    .line 551
    sub-int/2addr v8, v9

    .line 552
    aget v2, v2, v8

    .line 553
    .line 554
    add-int/2addr v1, v2

    .line 555
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 556
    .line 557
    invoke-virtual {v2, v5}, Lm3/y;->m(Landroid/view/View;)I

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    sub-int v2, v1, v2

    .line 562
    .line 563
    goto :goto_15

    .line 564
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->C()I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 569
    .line 570
    iget v8, v7, Lm3/r;->e:I

    .line 571
    .line 572
    aget v2, v2, v8

    .line 573
    .line 574
    add-int/2addr v2, v1

    .line 575
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 576
    .line 577
    invoke-virtual {v1, v5}, Lm3/y;->m(Landroid/view/View;)I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    add-int/2addr v1, v2

    .line 582
    goto :goto_15

    .line 583
    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->E()I

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 588
    .line 589
    iget v9, v7, Lm3/r;->e:I

    .line 590
    .line 591
    aget v8, v8, v9

    .line 592
    .line 593
    add-int/2addr v3, v8

    .line 594
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 595
    .line 596
    invoke-virtual {v8, v5}, Lm3/y;->m(Landroid/view/View;)I

    .line 597
    .line 598
    .line 599
    move-result v8

    .line 600
    add-int/2addr v8, v3

    .line 601
    move v12, v8

    .line 602
    :goto_15
    invoke-static {v5, v2, v3, v1, v12}, Lm3/k0;->L(Landroid/view/View;IIII)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v7}, Lm3/l0;->c()Z

    .line 606
    .line 607
    .line 608
    move-result v8

    .line 609
    if-nez v8, :cond_20

    .line 610
    .line 611
    invoke-virtual {v7}, Lm3/l0;->b()Z

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    if-eqz v7, :cond_1f

    .line 616
    .line 617
    goto :goto_16

    .line 618
    :cond_1f
    const/4 v7, 0x1

    .line 619
    goto :goto_17

    .line 620
    :cond_20
    :goto_16
    const/4 v7, 0x1

    .line 621
    iput-boolean v7, v4, Lm3/t;->c:Z

    .line 622
    .line 623
    :goto_17
    iget-boolean v8, v4, Lm3/t;->d:Z

    .line 624
    .line 625
    invoke-virtual {v5}, Landroid/view/View;->hasFocusable()Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    or-int/2addr v5, v8

    .line 630
    iput-boolean v5, v4, Lm3/t;->d:Z

    .line 631
    .line 632
    add-int/lit8 v6, v6, 0x1

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :cond_21
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 636
    .line 637
    const/4 v2, 0x0

    .line 638
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    nop

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final U0(La3/h;Lm3/w0;Lh3/x;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->l1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_3

    .line 9
    .line 10
    iget-boolean v0, p2, Lm3/w0;->g:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p4, v0, :cond_0

    .line 16
    .line 17
    move p4, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p4, 0x0

    .line 20
    :goto_0
    iget v1, p3, Lh3/x;->b:I

    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(ILa3/h;Lm3/w0;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    :goto_1
    if-lez v1, :cond_3

    .line 29
    .line 30
    iget p4, p3, Lh3/x;->b:I

    .line 31
    .line 32
    if-lez p4, :cond_3

    .line 33
    .line 34
    add-int/lit8 p4, p4, -0x1

    .line 35
    .line 36
    iput p4, p3, Lh3/x;->b:I

    .line 37
    .line 38
    invoke-virtual {p0, p4, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(ILa3/h;Lm3/w0;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    sub-int/2addr p4, v0

    .line 48
    iget v0, p3, Lh3/x;->b:I

    .line 49
    .line 50
    :goto_2
    if-ge v0, p4, :cond_2

    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    invoke-virtual {p0, v2, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->h1(ILa3/h;Lm3/w0;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-le v3, v1, :cond_2

    .line 59
    .line 60
    move v0, v2

    .line 61
    move v1, v3

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iput v0, p3, Lh3/x;->b:I

    .line 64
    .line 65
    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    array-length p1, p1

    .line 70
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 71
    .line 72
    if-eq p1, p2, :cond_5

    .line 73
    .line 74
    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 75
    .line 76
    new-array p1, p1, [Landroid/view/View;

    .line 77
    .line 78
    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 79
    .line 80
    :cond_5
    return-void
.end method

.method public final V(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/appcompat/widget/x3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final W()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/x3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final X(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/appcompat/widget/x3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Y(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/appcompat/widget/x3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Z(II)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/appcompat/widget/x3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/appcompat/widget/x3;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/util/SparseIntArray;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final a0(La3/h;Lm3/w0;)V
    .locals 7

    .line 1
    iget-boolean v0, p2, Lm3/w0;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Lm3/k0;->u(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lm3/r;

    .line 25
    .line 26
    invoke-virtual {v4}, Lm3/l0;->a()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    iget v6, v4, Lm3/r;->f:I

    .line 31
    .line 32
    invoke-virtual {v2, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 33
    .line 34
    .line 35
    iget v4, v4, Lm3/r;->e:I

    .line 36
    .line 37
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->a0(La3/h;Lm3/w0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final a1(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public final b0(Lm3/w0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->b0(Lm3/w0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 6
    .line 7
    return-void
.end method

.method public final e1(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v3, v0

    .line 9
    add-int/lit8 v4, v1, 0x1

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    array-length v3, v0

    .line 14
    sub-int/2addr v3, v2

    .line 15
    aget v3, v0, v3

    .line 16
    .line 17
    if-eq v3, p1, :cond_1

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 20
    .line 21
    new-array v0, v0, [I

    .line 22
    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    aput v3, v0, v3

    .line 25
    .line 26
    div-int v4, p1, v1

    .line 27
    .line 28
    rem-int/2addr p1, v1

    .line 29
    move v5, v3

    .line 30
    :goto_0
    if-gt v2, v1, :cond_3

    .line 31
    .line 32
    add-int/2addr v3, p1

    .line 33
    if-lez v3, :cond_2

    .line 34
    .line 35
    sub-int v6, v1, v3

    .line 36
    .line 37
    if-ge v6, p1, :cond_2

    .line 38
    .line 39
    add-int/lit8 v6, v4, 0x1

    .line 40
    .line 41
    sub-int/2addr v3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v6, v4

    .line 44
    :goto_1
    add-int/2addr v5, v6

    .line 45
    aput v5, v0, v2

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 51
    .line 52
    return-void
.end method

.method public final f(Lm3/l0;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lm3/r;

    .line 2
    .line 3
    return p1
.end method

.method public final f1(II)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 13
    .line 14
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 15
    .line 16
    sub-int v2, v1, p1

    .line 17
    .line 18
    aget v2, v0, v2

    .line 19
    .line 20
    sub-int/2addr v1, p1

    .line 21
    sub-int/2addr v1, p2

    .line 22
    aget p1, v0, v1

    .line 23
    .line 24
    sub-int/2addr v2, p1

    .line 25
    return v2

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 27
    .line 28
    add-int/2addr p2, p1

    .line 29
    aget p2, v0, p2

    .line 30
    .line 31
    aget p1, v0, p1

    .line 32
    .line 33
    sub-int/2addr p2, p1

    .line 34
    return p2
.end method

.method public final g1(ILa3/h;Lm3/w0;)I
    .locals 1

    .line 1
    iget-boolean p3, p3, Lm3/w0;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/x3;->a(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    invoke-virtual {p2, p1}, La3/h;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, -0x1

    .line 19
    if-ne p2, p3, :cond_1

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p3, "Cannot find span size for pre layout position. "

    .line 24
    .line 25
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "GridLayoutManager"

    .line 36
    .line 37
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    return p1

    .line 42
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 43
    .line 44
    invoke-virtual {v0, p2, p1}, Landroidx/appcompat/widget/x3;->a(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1
.end method

.method public final h1(ILa3/h;Lm3/w0;)I
    .locals 2

    .line 1
    iget-boolean p3, p3, Lm3/w0;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/x3;->b(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p3, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eq p3, v1, :cond_1

    .line 22
    .line 23
    return p3

    .line 24
    :cond_1
    invoke-virtual {p2, p1}, La3/h;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-ne p2, v1, :cond_2

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "GridLayoutManager"

    .line 45
    .line 46
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    return p1

    .line 51
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 52
    .line 53
    invoke-virtual {v0, p2, p1}, Landroidx/appcompat/widget/x3;->b(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1
.end method

.method public final i1(ILa3/h;Lm3/w0;)I
    .locals 3

    .line 1
    iget-boolean p3, p3, Lm3/w0;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez p3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Landroid/util/SparseIntArray;

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-virtual {p3, p1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eq p3, v2, :cond_1

    .line 20
    .line 21
    return p3

    .line 22
    :cond_1
    invoke-virtual {p2, p1}, La3/h;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ne p2, v2, :cond_2

    .line 27
    .line 28
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p3, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    .line 31
    .line 32
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "GridLayoutManager"

    .line 43
    .line 44
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return v1
.end method

.method public final j1(Landroid/view/View;IZ)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lm3/r;

    .line 6
    .line 7
    iget-object v1, v0, Lm3/l0;->b:Landroid/graphics/Rect;

    .line 8
    .line 9
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 10
    .line 11
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 12
    .line 13
    add-int/2addr v2, v3

    .line 14
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 18
    .line 19
    add-int/2addr v2, v3

    .line 20
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    add-int/2addr v3, v1

    .line 25
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 26
    .line 27
    add-int/2addr v3, v1

    .line 28
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 29
    .line 30
    add-int/2addr v3, v1

    .line 31
    iget v1, v0, Lm3/r;->e:I

    .line 32
    .line 33
    iget v4, v0, Lm3/r;->f:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->f1(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-ne v4, v6, :cond_0

    .line 44
    .line 45
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 46
    .line 47
    invoke-static {v5, v1, p2, v3, v4}, Lm3/k0;->w(ZIIII)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 52
    .line 53
    invoke-virtual {v1}, Lm3/y;->i()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, Lm3/k0;->m:I

    .line 58
    .line 59
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 60
    .line 61
    invoke-static {v6, v1, v3, v2, v0}, Lm3/k0;->w(ZIIII)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 67
    .line 68
    invoke-static {v5, v1, p2, v2, v4}, Lm3/k0;->w(ZIIII)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 73
    .line 74
    invoke-virtual {v1}, Lm3/y;->i()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p0, Lm3/k0;->l:I

    .line 79
    .line 80
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 81
    .line 82
    invoke-static {v6, v1, v2, v3, v0}, Lm3/k0;->w(ZIIII)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move v7, v0

    .line 87
    move v0, p2

    .line 88
    move p2, v7

    .line 89
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lm3/l0;

    .line 94
    .line 95
    if-eqz p3, :cond_1

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, v0, v1}, Lm3/k0;->v0(Landroid/view/View;IILm3/l0;)Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Lm3/k0;->t0(Landroid/view/View;IILm3/l0;)Z

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    :goto_1
    if-eqz p3, :cond_2

    .line 107
    .line 108
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method

.method public final k(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final k1(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 8
    .line 9
    if-lt p1, v0, :cond_1

    .line 10
    .line 11
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:Landroidx/appcompat/widget/x3;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/appcompat/widget/x3;->d()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "Span count should be at least 1. Provided "

    .line 25
    .line 26
    invoke-static {v1, p1}, La3/g;->n(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final l(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final l0(ILa3/h;Lm3/w0;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->l1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 14
    .line 15
    new-array v0, v0, [Landroid/view/View;

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 18
    .line 19
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->l0(ILa3/h;Lm3/w0;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final l1()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lm3/k0;->n:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lm3/k0;->D()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-virtual {p0}, Lm3/k0;->C()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v0, p0, Lm3/k0;->o:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lm3/k0;->B()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sub-int/2addr v0, v1

    .line 25
    invoke-virtual {p0}, Lm3/k0;->E()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->e1(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final n(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final n0(ILa3/h;Lm3/w0;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->l1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 14
    .line 15
    new-array v0, v0, [Landroid/view/View;

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:[Landroid/view/View;

    .line 18
    .line 19
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->n0(ILa3/h;Lm3/w0;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public final o(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final q0(Landroid/graphics/Rect;II)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2, p3}, Lm3/k0;->q0(Landroid/graphics/Rect;II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lm3/k0;->C()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lm3/k0;->D()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Lm3/k0;->E()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lm3/k0;->B()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v0

    .line 26
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    add-int/2addr p1, v2

    .line 36
    iget-object v0, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-static {v0}, Lg0/h0;->d(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p3, p1, v0}, Lm3/k0;->g(III)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 49
    .line 50
    array-length v0, p3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    aget p3, p3, v0

    .line 53
    .line 54
    add-int/2addr p3, v1

    .line 55
    iget-object v0, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    invoke-static {v0}, Lg0/h0;->e(Landroid/view/View;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {p2, p3, v0}, Lm3/k0;->g(III)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/2addr p1, v1

    .line 71
    iget-object v0, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 74
    .line 75
    invoke-static {v0}, Lg0/h0;->e(Landroid/view/View;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {p2, p1, v0}, Lm3/k0;->g(III)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->G:[I

    .line 84
    .line 85
    array-length v0, p1

    .line 86
    sub-int/2addr v0, v3

    .line 87
    aget p1, p1, v0

    .line 88
    .line 89
    add-int/2addr p1, v2

    .line 90
    iget-object v0, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    invoke-static {v0}, Lg0/h0;->d(Landroid/view/View;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p3, p1, v0}, Lm3/k0;->g(III)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_0
    iget-object p3, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final r()Lm3/l0;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const/4 v2, -0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lm3/r;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lm3/r;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Lm3/r;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lm3/r;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final s(Landroid/content/Context;Landroid/util/AttributeSet;)Lm3/l0;
    .locals 1

    .line 1
    new-instance v0, Lm3/r;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lm3/r;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final t(Landroid/view/ViewGroup$LayoutParams;)Lm3/l0;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm3/r;

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lm3/r;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, Lm3/r;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lm3/r;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final x(La3/h;Lm3/w0;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->F:I

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int/2addr v0, v1

    .line 22
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->g1(ILa3/h;Lm3/w0;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/2addr p1, v1

    .line 27
    return p1
.end method

.method public final y0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->E:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method
