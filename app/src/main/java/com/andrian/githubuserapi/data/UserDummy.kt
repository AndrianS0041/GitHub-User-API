package com.andrian.githubuserapi.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "JakeWharton",
            "https://avatars0.githubusercontent.com/u/285917?v=4",
            "https://github.com/jake",
            "https://api.github.com/users/jake/followers",
            10,
            "https://api.github.com/users/jake/following{/other_user}",
            15,
            "https://api.github.com/users/jake/repos",
            10
            ))

        list.add(User(
            "JakeWharton2",
            "https://avatars0.githubusercontent.com/u/285917?v=4",
            "https://github.com/jake",
            "https://api.github.com/users/jake/followers",
            10,
            "https://api.github.com/users/jake/following{/other_user}",
            15,
            "https://api.github.com/users/jake/repos",
            10
        ))

        list.add(User(
            "JakeWharton3",
            "https://avatars0.githubusercontent.com/u/285917?v=4",
            "https://github.com/jake",
            "https://api.github.com/users/jake/followers",
            10,
            "https://api.github.com/users/jake/following{/other_user}",
            15,
            "https://api.github.com/users/jake/repos",
            10
        ))

        list.add(User(
            "JakeWharton4",
            "https://avatars0.githubusercontent.com/u/285917?v=4",
            "https://github.com/jake",
            "https://api.github.com/users/jake/followers",
            10,
            "https://api.github.com/users/jake/following{/other_user}",
            15,
            "https://api.github.com/users/jake/repos",
            10
        ))

        list.add(User(
            "JakeWharton5",
            "https://avatars0.githubusercontent.com/u/285917?v=4",
            "https://github.com/jake",
            "https://api.github.com/users/jake/followers",
            10,
            "https://api.github.com/users/jake/following{/other_user}",
            15,
            "https://api.github.com/users/jake/repos",
            10
        ))

        return list
    }
}