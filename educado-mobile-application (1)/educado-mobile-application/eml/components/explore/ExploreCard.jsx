import { View, Text, Image, Pressable } from 'react-native'
import React from 'react'
import { useFonts, VarelaRound_400Regular } from '@expo-google-fonts/dev'
import { useNavigation } from '@react-navigation/native'
import { AppLoading } from 'expo-app-loading'


export default function ExploreCard({ title, courseId }) {
  const navigation = useNavigation()
  let [fontsLoaded] = useFonts({
    VarelaRound_400Regular
  })

  if (!fontsLoaded) {
    return AppLoading
  } else {
    return (
      <Pressable
        style={{ shadowColor: 'black', elevation: 10 }}
        className="w-2/5 h-24 rounded-md items-center flex-col bg-cyanBlue m-2"
        onPress={() => navigation.navigate('Course', { courseId: courseId })}
      >
        <Text numberOfLines={1} style={{ fontFamily: 'VarelaRound_400Regular', fontSize: 14, }} className="pt-4 text-gray-600">
          {title}
        </Text>
        <View className="pt-2">
          <Image
            className="w-10 h-10"
            source={require('../../assets/favicon.png')}
          ></Image>
        </View>
      </Pressable>
    )
  }
}
