import React from 'react'
import { StyleSheet, Text, View } from 'react-native'

const ProfileName = ({ UserName, Name, PhoneNumber }) => {
  return (
    <View className="items-center">
      <View
        style={styles.profileInfo}
        className="border p-8 rounded-full mb-28 w-fit"
      >
        <Text
          numberOfLines={1}
          adjustsFontSizeToFit={true}
          style={styles.profileName}
          className="text-limeGreenDarker pb-4"
        >
          {Name}
        </Text>
        <Text
          className="text-limeGreenDarker pb-2"
          style={styles.profileUserName}
        >
          {PhoneNumber}
        </Text>
      </View>
    </View>
  )
}
const styles = StyleSheet.create({
  profileInfo: {
    backgroundColor: 'hsl(0, 0%, 92%)',
    borderColor: 'hsl(0, 0%, 92%)'
  },
  profileName: {
    fontSize: 40,
    textAlign: 'center'
  },
  profileUserName: {
    fontSize: 20,
    textAlign: 'center'
  }
})

export default ProfileName
